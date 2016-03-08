/**
 * Created by Administrator on 2016/1/25.
 */
class ListDemo {
    public static void main(String[] args) {
        def numbers = [11,12,13,14]
        println(numbers[0]+" "+numbers[3]+" "+numbers[-1]+" "+numbers[-2]+" ")
        println([11,12,13,14][2])
        println(numbers.getAt(3)+" "+numbers.get(3))
        numbers[1]=[33,44]
        println(numbers)
        numbers<<15<<16
        println(numbers)
        def ss = [11,12,13,14]
        ss+=[15,16]
        println(ss)
        println(ss.reverse())
        def x = 1,y =2
        def m=[x:y,y:x]
        println(m.y)
        def careful=[1:'Ken','1':'Barclay']
        println(careful[1]+" & "+careful['1'])
        careful.put("test","test_test")
        println(careful.get("test"))

        def start = 10,finish = 20
        println(start..finish+1)
        print "ddddd:${x}"

        def dir = new File(".")
        dir.eachFile{file->
            println file
        }

    }
}
