/**
 * Created by Administrator on 2016/1/27.
 */
//----------List��Map��Range��each����----------
def  c1={
    args->
        println("ʹ�ñհ���ӡ���䣺"+args)
}

def  range1 = 1..5
range1.each(c1) //���佫ÿ��Ԫ�ش���հ�

//----------findAll����----------
def c2 = { args ->
    args > 3    //���Ϊ�棬�����������ֵ
}
def range2 = 1..5
def arr = range2.findAll(c2)    //���佫ÿ��Ԫ�ش���հ�
println(arr)

//----------collect����----------
def c3 = { args ->
    args + 3    //��ÿ������ִ�д˲����󷵻�
}
def range3 = 1..5
def arr2 = range3.collect(c3)    //���佫ÿ��Ԫ�ش���հ�
println(arr2)
//----------any/every����----------
def c4 = { args ->
    args > 3    //ÿ������Ĳ����������ж�
}
def range4 = 1..5
def boolean1 = range4.any(c4)    //������һ����������������true
println(boolean1)
def boolean2 = range4.every(c4)  //ȫ����������������true
println(boolean2)
//----------��ͨ����ת�հ�----------
//����һ������
def function (){
    println("Hello Closure")
}
//����һ���հ����÷���
def c = this.&function
c()
println(this)    //��ǰȫ�ָ���ConsoleScript