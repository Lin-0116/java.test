package demo1;
//目标：建立一个学生类，并使用接口的方法，完成对学生信息的统计分析。
//1.创建一个学生类，包含姓名，性别，成绩。
//2.创建一个接口1，包含两个方法，一个打印所有学生的信息，一个打印平均成绩。
//3.创建一个接口2，包含两个方法，一个打印所有学生的信息（并记录男生和女生的人数），一个打印平均成绩（用去掉最高分和最低分的方法）。
public class Test {
    public static void main(String[] args) {
        Student[]s=new Student[5];
        s[0]=new Student("小明",'男',90);
        s[1]=new Student("小红",'女',80);
        s[2]=new Student("小刚",'男',70);
        s[3]=new Student("小花",'女',60);
        s[4]=new Student("小草",'男',85);

        //可以选择实现接口1或者接口2
        //ClassDataInter cd=new ClassDataIntermpl1(s);
        ClassDataInter cd=new ClassDataIntermpl2(s);
        cd.printAllStudent();
        cd.printAverageScore();

    }

}
