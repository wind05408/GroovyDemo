/**
 * Created by Administrator on 2016/1/20.
 */
class Main {
    public static void main(String[] args) {
     println( 5.plus(2));
        println(5+2);
        def test ="123";
        println(test);
        def count = 1;
        count = count.next()
        count +=1;
        def go = count
        println(count);
        println(go)
        def age = 25
        println("""my age is ${age}""")
        def number = 25
        println(age == number)
        println(age instanceof Integer)
        def gv =10E4;
        println(gv)

        def greeting = "hello world"
        println(greeting[4])
        println(greeting[-1])
        println(greeting[1..2])
        println(greeting[1..<3])
        println(greeting[4..1])
        println(greeting[4,1,6])
        println(greeting*3)
        println(greeting-"ld")
        println(greeting.size()+" "+greeting.length()+" "+greeting.count("l")+" "+greeting.contains("lo"))
        println('ken'<=>'ken')
        println('ken'<=>'kenneth')
        println('ken'<=>'Ken')
        println('ken'.compareTo('Ken'))


    }
    public void test(){
        println("test");
    }
}
