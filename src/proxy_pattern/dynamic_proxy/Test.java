package proxy_pattern.dynamic_proxy;

import proxy_pattern.RealSubject;
import proxy_pattern.Subject;
import proxy_pattern.static_proxy.SubjectStaticProxy;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-07-15 17:53
 **/
class Test {

    public static void main(String[] args) {

        Subject subject = new RealSubject();

        Subject proxy = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), new SubjectDynamicProxy(subject));

        proxy.doSomething();
        //proxy.doSomething2();

    }
}
