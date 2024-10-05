package demo;

public class SilverCard extends Card {
    public SilverCard(String id, String name, String number, double money) {
        super(id, name, number, money);
    }

    @Override
    public void consume(double money) {
        System.out.println("消费了" + money + "元，银卡打折后实际支付了" + money * 0.9 + "元");
        this.setMoney(this.getMoney() - money * 0.9);
        if(money*0.9>this.getMoney())
        {
            System.out.println("您当前的余额为："+this.getMoney()+"您的余额不足，消费失败");
            return;
        }
        System.out.println("当前余额为：" + this.getMoney());
    }

}
