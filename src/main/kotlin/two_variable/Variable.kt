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


