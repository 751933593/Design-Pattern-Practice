package proxy_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 真正需要被代理的类
 * @author: liurunze
 * @create: 2019-07-15 17:49
 **/
public class RealSubject implements Subject {


    @Override
    public void doSomething() {
        System.out.println("我正在处理一些事情...");
    }

    @Override
    public void doSomething2() {
        System.out.println("do something 2...");
    }
}
