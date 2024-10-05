package demo1;

public class ClassDataIntermpl2 implements ClassDataInter{
    private Student[] students;
    public ClassDataIntermpl2(Student[] students) {
        this.students = students;
    }
//接口2，包含两个方法，一个打印所有学生的信息（并记录男生和女生的人数）。
    @Override
    public void printAllStudent() {
        int male=0;
        int female=0;
        for (int i=0;i<students.length;i++){
            System.out.println(students[i].getName()+" "+students[i].getSex()+" "+students[i].getScore());
            if (students[i].getSex()=='男'){
                male++;
            }else {
                female++;
            }
        }
        System.out.println("男："+male+" 女："+female);
    }
//一个打印平均成绩（用去掉最高分和最低分的方法）
    @Override
    public void printAverageScore() {
        double sum=0;
        double max=students[0].getScore();
        double min=students[0].getScore();
        for (int i=0;i<students.length;i++){
            if (students[i].getScore()>max){
                max=students[i].getScore();
            }
            if (students[i].getScore()<min){
                min=students[i].getScore();
            }
            sum+=students[i].getScore();
        }
        System.out.println("最高分："+max);
        System.out.println("最低分："+min);
        System.out.println("平均成绩："+(sum-max-min)/(students.length-2));
    }
}
