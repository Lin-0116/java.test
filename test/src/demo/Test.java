package demo;

import java.util.Scanner;

public class Test {
    //目标：加油站支付小程序
    //1.创建卡片类。以便创建金卡或银卡对象，存储车主信息
    //2.定义一个父类卡片类Card
    //3.定义子类金卡类GoldCard，继承自父类卡片类Card,改写消费方式，打折8折（独有功能打印洗车劵）
    //4.定义子类银卡类SilverCard，继承自父类卡片类Card，改写消费方式，打折9折
    //5.在主类中，创建支付机，模拟金卡和银卡的支付过程。
    //6.在主类中，模拟一个支付过程，根据存储金额，选择不同的卡，进行支付。
    public static void main(String[] args) {
        System.out.println("请输入存储金额：");
        Scanner sc=new Scanner(System.in);
        double money=sc.nextDouble();
        if(money>=5000)
        {
            System.out.println("欢迎使用金卡");
            GoldCard card=new GoldCard("京A6666","波妞","153666791",money);
            pay(card);
        }
        else
        {
            System.out.println("欢迎使用银卡");
            SilverCard card=new SilverCard("京A6666","波妞","153666791",money);
            pay(card);
        }
    }

    //支付机
    public static void pay(Card c)
    {
        System.out.println("请刷卡，输入当前消费的金额：");
        Scanner sc=new Scanner(System.in);
        double m=sc.nextDouble();
        c.consume(m);
    }
}
