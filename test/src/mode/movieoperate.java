package mode;

import java.util.Scanner;

public class movieoperate {

    public void show(movie[] mo) {
        System.out.println("编号\t\t电影名\t\t主演\t\t票价");
        for (int i = 0; i < mo.length; i++) {
            System.out.println(mo[i].getId() + "\t\t" + mo[i].getName() + "\t" + mo[i].getNumber() + "\t\t" + mo[i].getPrice());
        }
    }

    public void search(movie[] mo) {
        System.out.println("请输入要查询的电影编号：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        for (int i = 0; i < mo.length; i++) {
            if (mo[i].getId() == id) {
                System.out.println("编号\t\t电影名\t\t主演\t\t票价");
                System.out.println(mo[i].getId() + "\t\t" + mo[i].getName() + "\t" + mo[i].getNumber() + "\t\t" + mo[i].getPrice());
                return;
            }
        }
        System.out.println("没有找到该电影信息");
    }
}
