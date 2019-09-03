package decorator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 抽象修饰者
 * @author: liurunze
 * @create: 2019-08-30 15:25
 **/
public class DecoratorA extends Decorator{

    void decorate() {
        System.out.println("修饰A");
    }

    @Override
    void operate() {
        super.operate();
        decorate();
    }

    public static void main(String[] args) {

    }
}
