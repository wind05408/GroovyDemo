/**
 * Created by Administrator on 2016/1/27.
 */
//----------List、Map、Range的each方法----------
def  c1={
    args->
        println("使用闭包打印区间："+args)
}

def  range1 = 1..5
range1.each(c1) //区间将每个元素传入闭包

//----------findAll方法----------
def c2 = { args ->
    args > 3    //如果为真，返回这个参数值
}
def range2 = 1..5
def arr = range2.findAll(c2)    //区间将每个元素传入闭包
println(arr)

//----------collect方法----------
def c3 = { args ->
    args + 3    //对每个参数执行此操作后返回
}
def range3 = 1..5
def arr2 = range3.collect(c3)    //区间将每个元素传入闭包
println(arr2)
//----------any/every方法----------
def c4 = { args ->
    args > 3    //每个传入的参数都进行判断
}
def range4 = 1..5
def boolean1 = range4.any(c4)    //至少有一个参数符合条件即true
println(boolean1)
def boolean2 = range4.every(c4)  //全部参数符合条件才true
println(boolean2)
//----------普通方法转闭包----------
//定义一个方法
def function (){
    println("Hello Closure")
}
//定义一个闭包引用方法
def c = this.&function
c()
println(this)    //当前全局父类ConsoleScript