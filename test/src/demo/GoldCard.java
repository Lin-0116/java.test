package demo;

public class GoldCard extends Card {
    public GoldCard(String Id, String name, String number, double money) {
        super(Id, name, number, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("消费了" + money + "元，金卡打折后实际支付了" + money * 0.8 + "元");
        this.setMoney(this.getMoney() - money * 0.8);
        if(money*0.8>this.getMoney())
        {
            System.out.println("您当前的余额为："+this.getMoney()+"您的余额不足，消费失败");
            return;
        }
        System.out.println("当前余额为：" + this.getMoney());
        //如果消费大于等于200，独有功能：洗车券
        if(money*0.8>=200)
        {
            WashCar();
        }else
            System.out.println("您当前消费不满200，没有获得洗车券");

    }
    public void WashCar()
    {
        System.out.println("恭喜您，获得洗车券，可以到店洗车");
    }
}

