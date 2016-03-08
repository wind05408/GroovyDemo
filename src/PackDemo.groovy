/**
 * Created by Administrator on 2016/1/27.
 */
class PackDemo {
    public static void main(String[] args) {
        def closure1 = {
            println it;
            println("ÔÚ±Õ°üclosure1ÖÐ")
        }
        closure1.call("Hello")

//        def closure2={
//            args->
//            println args;
//                990999
//        }
    }
}
