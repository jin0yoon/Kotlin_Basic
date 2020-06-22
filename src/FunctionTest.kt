/*
Kotlin에서 다양하게 함수를 정의하고 사용할 수 있다.
- fun 함수명 (변수명 : 데이터크기, ...) : 리턴값 {return;}
- 한 줄로 표현가능한 함수는 {}대신 =로 정의 가능하다.
- 함수형 변수의 값 : {변수정의 -> 코드구현}
- 함수형 변수의 형 : (입력정의) -> 리턴정의
 */

fun main(args : Array<String>) {

    funByNoParam()
    funByParameter(31, " 숫자입니다.")
}


fun funByNoParam(){
    println("funByNoParam")
}

fun funByParameter(i: Int, s: String){
    println(i.toString() + s)
}