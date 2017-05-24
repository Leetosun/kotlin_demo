fun main(args: Array<String>) {

    val person = Person("李四", 24, null)
    println(person)//Person(name=李四, age=24, college=null, TAG='LMY')

    println(isOctogenarian(81))//true

    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }

    println(doubleTheResult(5, 6, sumLambda))//22
    println(doubleTheResult(1, 1, { x, y -> x - y }))//0

    val v1 = 1..5
    val v2 = 5 downTo 1
    val v3 = 5 downTo 1 step 2
    println(2 in v1)//true
    println(2 in v2)//true
    println(2 in v3)//false

    println(if (true) "Yes" else "No")//Yes

    println(when (18) {
        0 -> "New born"
        in 1..12 -> "Child"
        in 13..19 -> "Teenager"
        else -> "Adult"
    })//Teenager

    val names = arrayOf(1, 2, 3, 4, 5, 6)
    for (name in names) {
        println(name)
    }

    Demo2.f1()//这里是Demo2
    Demo3.f1()//这里是Demo1

    val name = "Lemme"
    println("My name is $name")//My name is Lemme

}

fun doubleTheResult(x: Int, y: Int, f: (Int, Int) -> Int): Int {
    return f(x, y) * 2
}

open class Person(var name: String, var age: Int, var college: String?) {
    val TAG: String = "LMY"

    override fun toString(): String {
        return "Person(name='$name', age=$age, college=$college, TAG='$TAG')"
    }

    open fun test(): String {
        return "1"
    }
}

class Employee(name: String, age: Int, college: String?, var company: String) : Person(name, age, college) {

    override fun test(): String {
        return "2"
    }

}

fun isOctogenarian(age: Int): Boolean = age in 80..89

