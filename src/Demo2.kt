object Demo2 {
    fun f1() {
        println("这里是Demo2")
    }
}

object Demo3 : Demo1() {
    override fun f1() {
        super.f1()
    }
}

open class Demo1 {
    open fun f1() {
        println("这里是Demo1")
    }
}