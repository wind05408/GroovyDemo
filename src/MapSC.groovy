/**
 * Created by Administrator on 2016/1/29.
 */
def libs = [['Ken','Groovy'],['Ken','UML'],['John','Java']]
libs<<['John','OOD']
libs.add(['Sally','Basic'])
println "libs:${libs}"
println libs.contains(['Ken','UML'])
println libs.size()
libs<<['Sally','VB']
println "libs:${libs}"

def greetins(){
    println("test function")
}
greetins()
assert 'ab' == 'a' + 'b'
def classes = [String, List, File]
for (clazz in classes)
{
    println clazz.'package'.name
}
println( [String, List, File].'package'.name )

def da = new Date()
println(da)
new File(".").eachFile{it->
    println it
}

current = 1
next = 1
10.times { //Ñ­»·10´Î
    print current + ' '
    newCurrent = next
    next = next + current
    current = newCurrent
}
println ''
def x = 1
assert x == 2