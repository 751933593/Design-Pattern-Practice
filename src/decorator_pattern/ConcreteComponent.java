package decorator_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 被修饰者
 * @author: liurunze
 * @create: 2019-08-30 14:55
 **/
public class ConcreteComponent extends Component{

    @Override
    void operate() {
        System.out.println("操作一些东西");
    }
}
