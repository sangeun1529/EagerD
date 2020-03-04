package nest.hana.EagerDeveloper.config.httpConfig;


import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * restTemplate는 기본적으로 connection pool 을 사용하지 않기 때문에 매 요청마다 handshake 수행한다.
 * 그러므로 미리 con pool 을 만들어 놓는다.
 */
@Configuration
public class HttpConnectionConfig {

    private final int CONNECTION_TIMEOUT=5000;
    private final int READ_TIMEOUT=5000;
    private final int MAX_COUNT=100;
    private final int PER_ROUTE=20;

    @Bean
    public RestTemplate getRestTemplate(){
        // 스펙에 넣을 구현체 팩토리
        HttpComponentsClientHttpRequestFactory httpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        httpRequestFactory.setConnectTimeout(5000);
        httpRequestFactory.setReadTimeout(5000);

        // 아파치 구현체
        HttpClient httpClient = HttpClientBuilder.create()
                .setMaxConnTotal(MAX_COUNT)
                .setMaxConnPerRoute(PER_ROUTE).build();

        httpRequestFactory.setHttpClient(httpClient);

        return new RestTemplate(httpRequestFactory);
    }

}
