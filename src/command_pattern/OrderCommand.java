package command_pattern;


/**
 * @program: Design-Pattern-Practice
 * @description: 下单命令类
 * @author: liurunze
 * @create: 2019-08-23 15:19
 **/
public class OrderCommand implements Command{

    private Order order;

    public OrderCommand(Order order){
        this.order = order;
    }

    @Override
    public void execute() {
        order.cookie();
    }
}
