
/**
 * Created by Administrator on 2016/1/26.
 */
class InAndOut {
    public static void main(String[] args) {


        printf("%d + %d = %d \n", 1, 2, 1+2)           // 1+2=3
        printf("%d + %d = %d \n", [1, 2, 1+2] )        // ��׼д��
        // %f����
        printf("%f + %f = %f \n", 1.0, 2.0, (1.0+2.0))   // 1.000000 + 2.000000 = 3.000000
        printf("%f + %f = %.2f \n", 1.0, 2.0, (1.0+2.0)) //����2λС����1.000000 + 2.000000 = 3.00
        // %s�ַ���
        printf("%s����Ů\n", "���")       // Ĭ�ϰ��ղ�����ӡ
        printf("%5s����Ů\n", "ABC")       // �����ִ�ռ5���ַ���λ�ã��ִ�����5λ����ಹ�ո�
        printf("%-5s����Ů\n", "A���C")   // �Ҳಹ�ո��ƺ�һ������ռһλ
        print("�������֣�")
        def name = new BufferedReader(new InputStreamReader(System.in)).readLine()
        println("��������ǣ�" + name)
        print("�������䣺")
        def age = new BufferedReader(new InputStreamReader(System.in)).readLine()
        println("��������ǣ�" + age)
    }
}
