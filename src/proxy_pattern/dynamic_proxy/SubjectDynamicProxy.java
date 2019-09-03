package proxy_pattern.dynamic_proxy;

import proxy_pattern.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: Design-Pattern-Practice
 * @description: subject的动态代理类
 * @author: liurunze
 * @create: 2019-07-15 17:56
 **/
public class SubjectDynamicProxy implements InvocationHandler{

    private Subject subject;

    public SubjectDynamicProxy(Subject subject){

        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before");
        Object obj = method.invoke(subject, args);
        System.out.println("after");

        return obj;
    }
}
