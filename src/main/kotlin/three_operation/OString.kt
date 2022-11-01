package three_operation

/**
 * ## ONE 문자열 더하는 방법 1
 *  + 연산자를 사용해서 문자열 2개를 더할 수 있다.
 *
 * ## TWO 문자열을 더하는 방법 2
 *  문자열 템플릿을 통해서 문자열 2개를 더할 수 있다.
 *
 *  ## THREE Int 를 더하는 방법 3
 *  숫자를 더할 때는 + 연산자를 이용할 수 있을 뿐 아니라, plus 함수를 호출할 수 있다.
 *
 *  ##
 * */
fun main() {
    one()
    two()
    three()
}

fun one() {
    val lastName = "John"
    val firstName = "Martin"

    println("========================one")
    println(firstName + " " + lastName)
    println(firstName + " " + "John")
}

fun two() {
    val lastName = "John"
    val firstName = "Martin"

    println("========================two")
    println("$firstName $lastName")
}

fun three() {
    var number1 = 1
    var number2 = 2

    println("========================three")
    println(number1 + number2)
    println(number1.plus(number2))
}
