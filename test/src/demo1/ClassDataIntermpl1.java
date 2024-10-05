package demo1;

public class ClassDataIntermpl1 implements ClassDataInter {
    private Student[] students;
    public ClassDataIntermpl1(Student[] students){
        this.students=students;
    }
    //创建一个接口1，包含两个方法，一个打印所有学生的信息，一个打印平均成绩。
    @Override
    public void printAllStudent() {
        for (int i=0;i<students.length;i++)
        {
            System.out.println(students[i].getName()+" "+students[i].getSex()+" "+students[i].getScore());
        }

    }
    @Override
    public void printAverageScore() {
        double sum=0;
        for (int i=0;i<students.length;i++)
        {
            sum+=students[i].getScore();
        }
        System.out.println("平均成绩为："+sum/students.length);

    }
}
