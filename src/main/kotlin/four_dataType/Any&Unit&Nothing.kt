package four_dataType

/**
 * https://readystory.tistory.com/143
 * */
fun main() {
}


/**
 * Any 는 모든 객체의 조상으로 java 의 Object 의 개념과 동일합니다.
 * */
fun Any() {
    var greeting: Any = "Hello, World"
    println("============================one")
    println(greeting)
    greeting = 2;
    println(greeting)
    greeting = 5.3;
    println(greeting)
}

/**
 *  Unit 은 Java 의 Void 와 같은 개념으로
 *  함수가 끝날 때 return 값이 없음을 의미한다.
 *  따라서 코틀린에서 Unit 을 return 타입으로 지정했으면 실질적인 리턴 타입이 없어야 한다. 또는 Unit 을 리턴할 수 있다.
 *
 *  굳이 자바의 void 와는 다른 용어를 사용하는 이유는 Unit 은 그 자체로 하나의 싱글톤 인스턴스 이기 때문이다.
 *  한편, Java 의 Void 와 달리 return 을 명시하지 않아도 된다는 점이 있으며, Generic 타입으로 Unit 을 넘겨줄 수 있다는 장점이 있다.
 * */
fun Unit() {

    fun returnsUnit(): Unit {
    }

    fun returnsUnitExplicitly1(): Unit {
        return
    }

    fun returnsUnitExplicitly2(): Unit {
        return Unit
    }

    fun returnUnitFromAny(): Unit {
        var result: Unit = Unit

        return result
    }

}

/**
 * Unit 의 경우 Generic 타입으로 Unit 을 넘겨줄 수 있다는 장점이 있다.
 * */
interface ShapeArea<T> {
    fun clac() : T
}

class NoResultProcessor : ShapeArea<Unit> {
    override fun clac() {
        println("36")
    }
}

/**
 * Nothing 은 함수가 정상적으로 끝나지 않음을 의미하는 타입입니다.
 * Nothing 은 모든 생성자가 private 으로 되어 있기 때문에 인스턴스를 생성할 수 없습니다.
 *
 * 정상적으로 함수가 끝나지 않는 다는 것은 아래 두가지 케이스를 의미합니다.
 * 1. 함수가 리턴 될 일이 없다.
 * 2. 예외를 던진다.
 *
 * 그리고 Nothing 은 return 타입이나 인자로만 사용이 가능하며, 변수 할당이 불가능합니다.
 * */

/**
 * Nothing : 함수가 리턴될 일이 없다.
 * */
fun infiniteLoop(): Nothing {

    while (true) {

    }
}

/**
 * Nothing : 예외를 던진다.
 */
fun throwException(): Nothing {
    throw Exception()
}

