package demo2;

import demo1.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //目标：面向对象编程，实现智能家居控制系统
        //角色：设备（吊灯，电视，洗衣机，空调......）
        //具备的功能：开关
        JD jds[]=new JD[4];
        jds[0]=new Lamp("小米吊灯",false);
        jds[1]=new Tv("三星电视",false);
        jds[2]=new WashMachine("美的洗衣机",false);
        jds[3]=new AirCondition("格力空调",true);

        SmartHomeControl smartHomeControl=SmartHomeControl.getInstance();
        //smartHomeControl.control(jds[0]);


        //用户输入设备序号，控制家电开关
        while (true) {
            smartHomeControl.showAll(jds);
            System.out.println("请输入要更改的设备序号：");
            Scanner sc = new Scanner(System.in);
            String index = sc.next();
            switch (index)
                {
                    case "1":
                        smartHomeControl.control(jds[0]);
                        break;
                    case "2":
                        smartHomeControl.control(jds[1]);
                        break;
                    case "3":
                        smartHomeControl.control(jds[2]);
                        break;
                    case "4":
                        smartHomeControl.control(jds[3]);
                        break;
                    case "exit":
                        return;
                    default:
                        System.out.println("输入有误，请重新输入！");
                }
        }


    }
}
