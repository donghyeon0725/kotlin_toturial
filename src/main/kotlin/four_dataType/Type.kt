package four_dataType

/**
 * ## one
 *      코틀린에서 기본적인 데이터의 타입은 아래와 같다.
 *
 * ## two
 *      코틀린의 정수형은 Byte, Short, Int, Long 이 있고, Long 데이터 타입의 경우 선택적으로 'L'을 붙일 수 있음
 *
 * ## three
 *      코틀린에서는 정수형의 범위가 Int 를 넘는 값을 변수에 할당하면 자동으로 Long 타입 변수에 할당하여 줍니다.
 *
 * ## four
 *      실수형에는 선택적으로 문자 F 가 리터럴을 의미하는 것으로 들어갈 수 있다.
 *
 * ## five
 *      10 의 거듭제곱을 나타내는 문자 E 가 정수형 데이터에 들어갈 수도 있습니다.
 *
 * ## six
 *      불 타입에는 true 또는 false 만 할당할 수 있습니다.
 *
 * ## seven
 *      bool 타입은 오직 true 또는 false 만 들어갈 수 있고 null 은 들어갈 수 없습니다. 다만 '?' 가 타입 뒤에 붙으면 null 을 사용할 수 있습니다.
 *
 * ## eight
 *      char 타입은 홅따옴표로 감싸진 1개의 문자만 할당할 수 있습니다. Java 와 달리 숫자는 할당할 수 없습니다.
 *
 * ## nine
 *      변수에 할당할 때, int 타입의 변수 값을 long 으로 자동 형변환 해주지 않습니다. toLong() 메소드를 호출해서 long 타입으로 변경해주어야 합니다.
 *      다만, 피연산자로 사용한 경우에는 자동으로 형변환 됩니다. 5 + 7L
 *
 * ## ten
 *      형변환은 as 라는 키워드를 통해서 할 수 있다.
 * */
fun main() {
    one()
    two()
    three()
    four()
    five()
    six()
    seven()
    eight()
    nine()
    ten()
}

fun one() {
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    println("=========================one")
    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)
}


fun two() {
    var byte: Byte = 100            // -128 ~ 127 (1 byte)
    var short: Short = 5000         // -32768 ~ 32767 (2 byte)
    var int: Int = 100000           // -2147483648 ~ 2147483647 (4 byte)
    var long: Long = 15000000000L   // -9223372036854775807 ~ 9223372036854775807 (8 byte)

    println("=========================two")
    println(byte)
    println(short)
    println(int)
    println(long)
}


fun three() {
    val int = 2147483647  // Int
    val long = 2147483648  // Long

    println("=========================three")
    println(int)
    println(long)
}

fun four() {
    var float: Float = 5.75F
    var double: Double = 19.99

    println("=========================four")
    println(float)
    println(double)
}


fun five() {
    var float: Float = 35E3F    // 10 의 거듭제곱을 나타내는 e나 E 같은 문자열이 들어갈 수도 있다. F 는 float 리터럴을 이야기 하는 것
    var double: Double = 12E4

    println("=========================five")
    println(float)
    println(double)
}


fun six() {
    var boolean: Boolean = true     // or false
    println("=========================six")
    println(boolean)
}

fun seven() {
    val booleanTrue = true;
    val booleanFalse = false;
    val booleanNull: Boolean? = null;

    println("=========================seven")
    println(booleanTrue)
    println(booleanFalse)
    println(booleanNull)
}

fun eight() {
    val char: Char = 'B'

    println("=========================eight")
    println(char)

//    val char: Char = 66
//    println(char) // Error
}


fun nine() {
    val int: Int = 5
//    val long: Long = int
    val long: Long = 7
    val convertedLong = int.toLong()
    println("=========================ten")
    println(convertedLong)
    println(int + long)
    println(5 + 7L)

}

fun ten() {
    val int: Int = 5
    val long: Long = int as Long
}
