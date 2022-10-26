/**
 * 실행하기 전에
 * 1. 대상 플랫폼의 JVM 버전과 실행환경의 JVM 버전이 일치해야 한다.
 * 2. 환경설정 - 빌드,실행,배포 - Gradle 에서 빌드 & 실행 주체를 Gradle 이 아닌 intellij 로 바꾼다.
 *
 *
 * 버전 1.3 이전의 Kotlin 은 main 함수를 작성할 때 "fun main(args: Array<String>)" 와 같이 매개변수를 꼭 작성해야 했다.
 * 그런데 이후 버전은 아니다.
 * */
class HelloWorld {
}

fun main(args: Array<String>) {
    print("Hello World")
}
