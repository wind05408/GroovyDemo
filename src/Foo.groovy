/**
 * Created by Administrator on 2016/1/27.
 */
class Foo {
    Foo() {
        println("构造方法")
    }

    def method(i){
        println i+",调用Foo的method方法"
    }

    def c1 = {
        Closure c ->
            println("delegate.class："+delegate.class)
            println("this:"+this)
            println("delegate==this:"+(delegate==this))
            if(c){
                println("c.delegate.class:"+c.delegate.class)
                c.delegate = this
                c()
            }
    }
}
