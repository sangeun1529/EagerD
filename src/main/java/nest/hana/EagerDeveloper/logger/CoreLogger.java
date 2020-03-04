package nest.hana.EagerDeveloper.logger;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class CoreLogger implements EDLogger {

    @Around("execution(* nest.hana.EagerDeveloper.config.*.*(..))")
//    @Around("@annotation(Override)")
    public Object logging(ProceedingJoinPoint jp) throws Throwable {
        log.info("start --" + jp.getSignature().toLongString());
        Object oj =  jp.proceed();
        log.info("end --" +  jp.getSignature().toLongString());
        return oj;
    }
}
