package demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //@Date注解可以自动生成getter/setter方法
@NoArgsConstructor //@NoArgsConstructor注解可以自动生成无参构造方法
@AllArgsConstructor //@AllArgsConstructor注解可以自动生成有参构造方法
//卡片上记录的车主信息
public class Card {
    private String Id;//车牌号
    private String Name;
    private String Phone;
    private double money;//余额

    //消费金额
    public void consume(double money) {
        this.money -= money;
    }
    //存储金额
    public void deposit(double money) {
        this.money += money;
    }
}

