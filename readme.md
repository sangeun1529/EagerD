EagerD (이거디~) 의 첫 project
============================

***

개발계획 ( plan )
-------

* core 기술(라이브러리)들의 집약체 프로젝트로 개발계획을 잡음.

* 새로운 라이브러리나 기술등을 접목시킬 프로젝트

* MSA , 애자일로 개발방식 진행. (혼자 진행인데 음.. 우선 계획만 잡아보자..)

* 각 라이브러리를 상용레벨까지 사용할 수 있도록 만들예정 (jar 배포 , 개인 nexus)

* 1일 1커밋을 목표로 한다.

* structure 가 추가될 때마다 추가작성 

***

### STRUCTURE

* rabbitMQ 개발
  + 공식 예제를 통한 기본사용법 숙달

* logback 으로 AOP 사용하여 개발
  + 서비스와 코어 로직이 늘어날때 마다 추가예정
  + 기본 틀 개발
  + slf4J , logback 사용

* command 패턴 기반으로한 쿼츠 스케쥴링 개발 (진행중)
  + 설정커밋 

* Rest , web 라이브러리
  + restTemplate(spec) , httpclient (impl)
  + selenium
  
* proxy : cloud 기반 서버 구성 (squid)
* Junit (단위 테스트 (컴포넌트레벨까지..))
* ORM - JPA
* DB - H2
