## Road to deploy
***
### SpringBoot 2.7.11, JDK 11
* JPA
* ThymeLeaf
* MySql 8.0
* Devtools
* SpringWeb
* lombok
***
### 배포 위치 EC2

#### 배포 방법(현재는 수동 배포 )
* 로컬에서 Github 업로드
* EC2에서 Github 클론
* EC2에 자바,mysql설치
* 프로젝트빌드
* 백그라운드로 실행

### 이슈
1 처음에 ./gradlew build시 mysql을 설치하지 않아서 계속 빌드실패

2 작성해둔 테스트코드가 통과되지 않은 상태에서 빌드하려니 에러남

3 프리티어 메모리 부족현상으로 빌드시 무한로딩 발생--swap메모리로 해결
>swap메모리란 HDD의 일부분을 RAM처럼 사용하는 것이다