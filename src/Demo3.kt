interface MyInterface {
    fun bar()
}

class MyInterfaceImpl : MyInterface {
    override fun bar() {
        print("这里是实现")
    }
}