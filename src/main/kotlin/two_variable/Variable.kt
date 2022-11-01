package two_variable

/**
 * ## ONE : 변수의 저장
 * 1. 변수는 아래와 같이 var 또는 val 을 사용하여 저장합니다.
 * 코틀린은 main 함수의 name 변수가 String, birthYear 가 Int 라는 것을 이해합니다.
 * 다만, 이는 초기화 시점에 변수에 값을 할당 했을 때 적용됩니다.
 *
 * ## TWO : 변수의 타입 지정
 * 1. var, val 모두 타입을 지정할 수 있으며 세미콜론과 함께 사용하여 타입을 지정합니다.
 * 그러나 이는 THREE 와 같이 타입 지정과 값 할당을 나누었을 때 유효 합니다.
 *
 * ## THREE : 변수 타입 지정 실전 예제
 *
 * ## FOUR : var 와 val 의 차이점
 * val 는 변하지 않는 값을 담을 때 사용하면 좋다.
 *
 *
 *
 * 이름에는 문자, 숫자, 밑줄 및 달러 기호가 포함될 수 있습니다.
 * 이름은 문자로 시작해야 합니다.
 * 이름은 $ 및 _로 시작할 수도 있습니다(그러나 이 자습서에서는 사용하지 않습니다).
 * 이름은 대소문자를 구분합니다("myVar"와 "myvar"는 다른 변수임).
 * 이름은 소문자로 시작해야 하며 공백을 포함할 수 없습니다.
 * 예약어(var또는 같은 Kotlin 키워드와 같은 String)는 이름으로 사용할 수 없습니다.
 * */
class Variable {
    fun one() {
        var name = "John"       // String
        val birthYear = 1975    // Int

        println(name)
        println(birthYear)
    }

    fun two() {
        var name: String = "John"
        val birthYear: Int = 1975;

        println(name)
        println(birthYear)
    }

    fun three() {
        var name: String
        val birthYear: Int

        name = "John"
        birthYear = 1975

        println(name)
        println(birthYear)
    }

    fun four() {
        val pi = 3.141592
//        pi = 4.141592   error
        println(pi)
    }
}

fun main() {
    var variable = Variable()
    variable.one()
    variable.two()
    variable.three()
    variable.four()
}


