# springboot-naver-api-search
(Clone) 네이버 지역검색 API를 활용한 맛집 List 끄적끄적

---
### 1. 개발 순서
* 프로젝트 생성(Springboot, Gradle)
* Memory CRUD DB 개발 및 Test
* Naver APi 연동
  * Local Search Rest Api(GET)
  * Image Search Rest Api(GET)


---
### 2. 필요 개념
* Annotaion
  * 컨트롤러 : @Controller(프렌젠테이션 레이어, 웹 요청과 응답을 처리)
  * 로직 처리 : @Service(서비스 레이어, 내부에서 자바 로직을 처리)
  * 외부I/O 처리 : @Respository(퍼시스턴스 레이어, DB나 파일 같은 외부 I/O 작업을 처리)
  * 의존성 주입 :
    * @Resource : 필드명 또는 생성자 파라미터 변수의 이름과 Bean 객체의 ID 를 mapping
    * @Autowired : 타입이 같은 Bean을 먼저 찾음, 같은 타입이 여러 개일 경우 이름으로 찾음.
  * 테스트 : @SpringBootTest, @Test
* YAML 파일 : 
* 


---

### 3. 실행 오류
* Execution failed for task ':test' 오류
  * settings -> Build Tools -> Gradle -> test 위치 intellij로 설정


