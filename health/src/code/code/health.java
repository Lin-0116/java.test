package code.code;

import java.util.Scanner;

public class health {
 public static void main(String[] args) {
     //目标：完成健康计算器
     Scanner sc=new Scanner(System.in);
     //1.先让用户输入自己的身高，体重，年龄，性别
     System.out.println("请输入身高: ");
     double height=sc.nextDouble();
     System.out.println("请输入体重: ");
     double weight=sc.nextDouble();
     System.out.println("请输入年龄: ");
     int age=sc.nextInt();
     System.out.println("请输入性别(1:男，2:女): ");
     int sex=sc.nextInt();

     double bmi=bmi(weight,height);
     System.out.println("BMI值："+bmi);

     double bmr=bmr(weight,height,age,sex);
     System.out.println("基础代谢率："+bmr);


 }
    //2.根据用户的输入，计算出BMI值（把数据交给一个独立的方法来计算并返回计算结果）
    public static double bmi(double weight,double height){
        return weight/(height*height);
    }
    //3.根据用户的输入，计算出BMR值（把数据交给一个独立的方法来计算并返回计算结果）
    public static double bmr(double weight,double height,int age,int sex){
        if(sex==1){
            return 66+13.7*weight+5*height-6.8*age;
        }else{
            return 655+9.6*weight+1.8*height-4.7*age;
        }
    }
}
