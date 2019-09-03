package factory_method_pattern.simple_factory_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 产品实现类 灯泡
 * @author: liurunze
 * @create: 2019-07-23 17:14
 **/
public class Culb implements Product{


    @Override
    public void display() {

        System.out.println("展示灯泡");
    }
}
