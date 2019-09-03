package proxy_pattern.static_proxy;

import proxy_pattern.RealSubject;
import proxy_pattern.Subject;

/**
 * @program: Design-Pattern-Practice
 * @description: 代理类
 * @author: liurunze
 * @create: 2019-07-15 17:51
 **/
public class SubjectStaticProxy implements Subject {

    private Subject subject;

    @Override
    public void doSomething() {

        System.out.println("在做事情之前，我需要...");

        if (subject == null) {
            subject = new RealSubject();
        }
        subject.doSomething();

        System.out.println("在做事情之后，我需要...");
    }

    @Override
    public void doSomething2() {

    }

}
