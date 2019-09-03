package command_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-23 17:00
 **/
public class Test {

    public static void main(String[] args) {

        // 创建一个invoker
        Customer zhangsan = new Customer();

        // 创建一个receiver, 该订单有鱼，米饭，立即做
        Order order1 = new Order();
        order1.setFish(true);
        order1.setRice(true);

        // 创建一个做饭命令
        OrderCommand orderCommand = new OrderCommand(order1);

        // 创建一个做饭命令
        PayCommand payCommand = new PayCommand(order1);

        // 张三发布做饭命令
        System.out.println("张三发布做饭命令");
        zhangsan.setCommand(orderCommand);
        zhangsan.execute();

        // 张三发布支付命令
        System.out.println("张三发布支付命令");
        zhangsan.setCommand(payCommand);
        zhangsan.execute();

        // 第二天张三想和昨天一样
        System.out.println("第二天张三想和昨天一样");
        zhangsan.redo();

        // 张三想清空命令，发布其他命令
        zhangsan.undo();
    }


}
