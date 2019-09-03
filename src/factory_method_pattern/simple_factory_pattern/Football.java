package factory_method_pattern.simple_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 产品实现类 足球
 * @author: liurunze
 * @create: 2019-07-23 17:16
 **/
public class Football implements Product{


    @Override
    public void display() {
        System.out.println("展示足球");
    }
}
