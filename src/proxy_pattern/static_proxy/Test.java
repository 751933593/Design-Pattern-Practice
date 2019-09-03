package proxy_pattern.static_proxy;

import proxy_pattern.Subject;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-07-15 17:53
 **/
public class Test {

    public static void main(String[] args) {

        Subject proxy = new SubjectStaticProxy();

        proxy.doSomething();
    }
}
