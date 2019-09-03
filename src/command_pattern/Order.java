package command_pattern;

import java.util.Date;

/**
 * @program: Design-Pattern-Practice
 * @description: 订单类 命令接收者Receiver
 * @author: liurunze
 * @create: 2019-08-23 14:59
 **/
public class Order {

    private boolean fish; //鱼 10元
    private boolean apple; //苹果 5元
    private boolean rice; //米饭 2元
    private boolean noodles; //面条 12元

    private Date cookieTime; //期望开始做饭的时间

    //开始做饭
    public void cookie(){
        if (cookieTime==null) {cookieTime=new Date();};
        if (System.currentTimeMillis()>=cookieTime.getTime()){
            StringBuilder sb = new StringBuilder("开始做：");
            sb.append(fish ? "鱼 ":"");
            sb.append(apple ? "苹果 ":"");
            sb.append(rice ? "米饭 ":"");
            sb.append(noodles ? "面条 ":"");
            System.out.println(sb.toString());
            return;
        }
        System.out.println("当前时间不是该订单期望开始做饭时间！无法开始做饭！");
    }

    public void pay(){
        int payAmount = 0;
        payAmount += fish?10:0;
        payAmount += apple?5:0;
        payAmount += rice?2:0;
        payAmount += noodles?12:0;
        System.out.println("支付："+payAmount+"元");
    }

    public void setFish(boolean fish) {
        this.fish = fish;
    }

    public void setApple(boolean apple) {
        this.apple = apple;
    }

    public void setRice(boolean rice) {
        this.rice = rice;
    }

    public void setNoodles(boolean noodles) {
        this.noodles = noodles;
    }

    public void setCookieTime(Date cookieTime) {
        this.cookieTime = cookieTime;
    }
}
