package command_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 支付命令类
 * @author: liurunze
 * @create: 2019-08-23 15:19
 **/
public class PayCommand implements Command{

    private Order order;

    public PayCommand(Order order){
        this.order = order;
    }

    @Override
    public void execute() {
        order.pay();
    }
}
