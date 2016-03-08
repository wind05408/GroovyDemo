/**
 * Created by Administrator on 2016/1/27.
 */
class MapDemo {
    public static void main(String[] args) {
        def libs = [['Ken','Groovy'],['Ken','UML'],['John','Java']]
        libs<<['John','OOD']
        libs.add(['Sally','Basic'])
        println "libs:${libs}"
        println libs.contains(['Ken','UML'])
        println libs.size()
        libs['Sally']=libs['Sally']<<'VB'
        println "libs:${libs}"
       println URLEncoder.encode 'a b'
    }
}
