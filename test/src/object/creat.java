package object;

public class creat {
   //创建一个学生信息对象
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="波妞";
        s1.ChineseScore=100;
        s1.MathScore=100;

        Student s2=new Student();
        s2.name="波仔";
        s2.ChineseScore=59;
        s2.MathScore=100;

        System.out.println(s1.name+"的分数是："+s1.ChineseScore+","+s1.MathScore);
        System.out.println(s2.name+"的分数是："+s2.ChineseScore+","+s2.MathScore);
    }

}
