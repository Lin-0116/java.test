package demo2;

public class SmartHomeControl {

    private static final SmartHomeControl smartHomeControl=new SmartHomeControl();
    private SmartHomeControl(){}
    public static SmartHomeControl getInstance(){
        return smartHomeControl;
    }
    public void control(JD jds) {
        System.out.println(jds.getName() + "当前的状态为："+(jds.isStatus()?"打开":"关闭"));
        System.out.println("-----开始操作-----");
        jds.press();
        System.out.println(jds.getName() + "更改后的状态为："+(jds.isStatus()?"打开":"关闭"));
        System.out.println("-----操作结束-----");
    }
    //展示全部家电信息
    public void showAll(JD[] jds) {
        for (int i=0;i< jds.length;i++) {
            JD jd=jds[i];
            System.out.println((i+1)+"\t"+jd.getName() + "当前的状态为："+(jd.isStatus()?"打开":"关闭"));
        }
        System.out.println("输入exit退出程序");
    }
}
