/*
late, lazy 초기화
- [lateinit]
- lateinit 예약어는 클래스에서 초기화없이 [변수:형] 만으로 선언가능하다.
- var만 사용가능. 변수형이 nullable이 아니더라도 컴파일 가능
- primitive형은 불가능함
- [lazy]
- 코드 어디선가 사용할 때, 1회 초기화 실행된다. (안드로이드에서 위젯 초기화시 유리)
- val로 선언
- primitive형도 가능함.
- 초기화 실행 시, 일련의 코딩도 가능하다.
 */