/**
 * 매개변수 없이 클래스를 생성항 수 있습니다.
 * */
class Person { /*...*/ }

/**
 * 클래스는 아래 세가지로 이루어집니다.
 * 1. 클래스 이름
 * 2. 클래스 헤더 (유형 매개변수, 기본생성자, 기타사항 지정)
 * 3. 본문 (괄호 내부)
 *
 * 헤더와 본문은 선택사항이며 없는 경우 생략이 가능합니다.
 * */
class Empty

/**
 * 코틀린의 클래스에는 기본생성자와 보조 생성자가 있을 수 있음
 * 기본 생성자는 클래스 헤더의 일부이다.
 * 그리고, 클래스 이름과 선택적 매개변수 뒤에 옵니다.
 * */
class Animal constructor(name: String) { /*...*/ }

/**
 * constructor 는 주석이 없는 경우 생략이 가능하다.
 * */
class Constructor1 @SafeVarargs constructor (name: String) {}
class Constructor2 (name: String) {}


/**
 * 초기화 관련한 코드는 init 이라는 키워드가 붙은 블록에 할 수 있습니다.
 *
 * 위에서 부터 순서대로 실행됩니다.
 * 초기화 블록에서는 기본 생성자의 매개변수를 사용할 수 있습니다.
 * */
class InitOrderDemo(name: String) {
    // 1 번 실행
    val firstProperty = "First property: $name".also(::println)

    // 2번 실행
    init {
        println("First initializer block that prints $name")
    }

    // 3 번 실행
    val secondProperty = "Second property: ${name.length}".also(::println)

    // 4 번 실행
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

/**
 * 기본 필드는 다음과 같이 초기화 할 수 있습니다.
 * */
class Customer(name: String) {
    val name = name.uppercase()
}

/**
 * 코틀린에서는 초기화에 드는 코드 비용을 줄이기 위해서 다음과 같은 설탕 문법을 지원합니다.
 *
 * 당연히 init 블록에서 참조하는 변수는 생성자의 매개변수이고, 매서드 run 에서 참조하는 변수이름은 초기화된 필드의 이름입니다.
 * */
class Computer(val name:String, val modelName: String, val power: Int) {
    init {
        println("computer init. name : ${name}, model name : ${modelName}, power : $power")
    }

    fun run() {
        println("computer run. name : ${name}, model name : ${modelName}, power : $power")
    }
}

/**
 * 기본 생성자의 매개변수 값은 기본 값을 포함할 수도 있습니다.
 * 또한 접근 제한자를 포함 할 수 있습니다.
 * */
class Phone(private val name: String, private val price: Int = 70) { /*...*/}


/**
 * 코딩의 편리함을 위해서 java 에서 enum 타입의 인스턴스를 작성할 때 마지막 인스턴스 뒤에 세미콜론 대신에 '쉼표' + '세미콜론' 조합을 허용하는데
 * 이를 '후행쉼표' 라고 한다.
 *
 * 코틀린의 생성자는 이런 후행쉼표를 허용한다.
 * */
class Keyboard(
    private val name: String,
    private val price: Int = 70,
) { /*...*/ }

/**
 * 생성자의 주석은 생성자의 접근제한자와 매개변수 사이에 위치시킬 수 있습니다.
 * */
class Can public @SafeVarargs constructor() { /*...*/ }

/**
 * 본문 안에 있는 생성자를 보조생성자라고 부르는데
 * 보조생성자는 본문에 작성 합니다.
 * 보조생성자가 있는 경우 자바와 동일하게 기본 생성자가 없는 것으로 취급됩니다.
 * 보조생성자에서는 코드를 실행시킬 수 있습니다.
 * */
class Object(val colors: MutableList<Color> = mutableListOf())
class Color {
    constructor(obj: Object) {
        obj.colors.add(this) // adds this pet to the list of its owner's pets
    }
}

/**
 * 기본 생성자가 있는 경우 보조생성자는 무조건 기본생성자를 호출해야합니다.
 * 이를 기본생성자에 '위임'한다고 말합니다.
 * 보조생성자에서 받는 매개변수를 this 키워드를 통해서 기본생성자에 위임할 수 있습니다.
 * */
class Book(val name: String) {
    constructor(name: String, price: Int) : this(name) {}
}

/**
 * 보조 생성자는 필드를 선언하면서 값을 받는 것이 불가능하고, 오직 초기화 용도로
 * 값을 받는 매개변수 선언만 가능합니다.
 * */
class Robot {
    val name: String
    val price: Int
    constructor(name: String, price: Int) {
        this.name = name;
        this.price = price
    }
}



fun main() {
    InitOrderDemo("target")
    println("======================================================")
    Computer("kim", "mac", 7).run()
    Color(Object())
}
