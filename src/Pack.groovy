/**
 * Created by Administrator on 2016/1/27.
 */
//def closure1={
//    println it;    //�ؼ��֡�it���ǲ���������
//    println("�ڱհ�closure1��"+it)
//}
////����һ���вεıհ� def �հ���={����,����,���� -> �����}
//def closure2={
//    args ->
//        println args;
//        990999    //ʡ���ˡ�return�������Ƿ���ֵ �� [url=http://www.cuiweiyou.com]http://www.cuiweiyou.com[/url]
//}
////ʹ�á�.call()�������޲αհ����������������������ɡ�it������
//closure1.call("Hello")    //Ҳ��������ֱ�ӱհ�������
////�����вαհ���ֱ�Ӵ�������������ɱհ����Զ���ġ�args������
//closure2("Groovy")    //Ҳ��������ʹ��.call����
//println("���أ�"+closure2("������Groovy"))        //��ӡ�հ�����ֵ

def foo = new Foo()
foo.method(0)

def c2 ={
    println("delegate.class1:"+delegate.class)
    method(1)
}

foo.c1(c2)
c2()

new java.io.File(".").eachFileRecurse{ println(it)}//����java���ڸ÷���

