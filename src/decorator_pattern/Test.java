package decorator_pattern;


/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-30 14:08
 **/
public class Test {

    public static void main(String[] args) {

        System.out.println("创建一个被修饰者");
        Component component = new ConcreteComponent();

        System.out.println("创建一个修饰者");
        Decorator decorator = new DecoratorA();
        decorator.setComponent(component);

        decorator.operate();
    }
}
