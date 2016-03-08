/**
 * Created by Administrator on 2016/1/27.
 */
//def closure1={
//    println it;    //关键字“it”是参数接收者
//    println("在闭包closure1中"+it)
//}
////定义一个有参的闭包 def 闭包名={参数,参数,参数 -> 代码块}
//def closure2={
//    args ->
//        println args;
//        990999    //省略了“return”，这是返回值 。 [url=http://www.cuiweiyou.com]http://www.cuiweiyou.com[/url]
//}
////使用“.call()”调用无参闭包，但传入参数。这个参数由“it”接收
//closure1.call("Hello")    //也可以如下直接闭包名传参
////调用有参闭包，直接传入参数。参数由闭包中自定义的“args”接收
//closure2("Groovy")    //也可以如上使用.call调用
//println("返回："+closure2("哈哈，Groovy"))        //打印闭包返回值

def foo = new Foo()
foo.method(0)

def c2 ={
    println("delegate.class1:"+delegate.class)
    method(1)
}

foo.c1(c2)
c2()

new java.io.File(".").eachFileRecurse{ println(it)}//假设java存在该方法

