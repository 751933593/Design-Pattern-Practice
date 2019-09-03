## 模板方法模式

### 应用场景

```reStructuredText
（1）框架初始化时，控制整体逻辑
（2）整体逻辑固定，其中部分业务不固定
```

### 角色
- AbstractTemplate 抽象模板类
- ConcreteTemplate 具体模板类

### 优势和缺陷

- 优势
  
  1. 控制顶层逻辑，部分业务交给子类完成
- 缺陷
  1. 抽象模板类中的有参构造方法，在其子类中也要实现

### 模板方法模式

```java
public abstract class Process{
    public boolean sign;
    public Process(boolean sign){
        this.sign = sign;
    }
    /**
     * 这是模板方法，规定在sign为true的情况下，先执行add、再执行sub
     */
    public void calculate(){
        if (sign) {
            add();
            sub();
        }
    }
    public abstract void add();
    public abstract void sub();
}

public class ConcreteProcess extends Process{
    public ConcreteProcess(boolean sign){ 
        //这里子类需要实现父类的非默认构造器，且父类构造方法的参数顺序要注意
        super(sign);
    }
    @Override
    public void add(){
        System.out.println("执行加法");
    }
    
    @Override
    public void sub(){
        System.out.println("执行减法");
    }
}
```

### 控制反转（Inversion of Control）改写

```java
public class Context{
    public Process process;
    public void setProcess(Process process){
        this.process = process;
    }
    public void calculate(){
        process.add();
        process.sub();
    }
}

public interface Process(){
    void add();
    void sub();
}

public class ConcreteProcess implements Process{
    
    @Override
    public void add(){
        System.out.println("执行加法");
    }
    @Override
    public void sub(){
        System.out.println("执行减法");
    }
}
```

### 模板方法中的钩子方法（hook method）

```java
public abstract class Process{
    public boolean sign;
    public Process(boolean sign){
        this.sign = sign;
    }
    /**
     * 这是模板方法，规定在sign为true的情况下，先执行add、再执行sub
     */
    public void calculate(){
        if (sign) {
            add();
            sub();
            multi();
        }
    }
    public abstract void add();
    public abstract void sub();
    //钩子方法，在父类中是空方法，具体内容可以在子类中重写实现，也可以不实现。形式灵活。
    public void multi(){
        
    }
}

public class ConcreteProcess extends Process{
    public ConcreteProcess(boolean sign){ 
        //这里子类需要实现父类的非默认构造器，且父类构造方法的参数顺序要注意
        super(sign);
    }
    @Override
    public void add(){
        System.out.println("执行加法");
    }
    
    @Override
    public void sub(){
        System.out.println("执行减法");
    }
    
    @Override
    public void multi(){
        System.out.println("执行乘法");
    }
}
//测试类
public class Test{
    public static void main(String[] args){
        Process process = new ConcreteProcess(true);
        process.calculate();
    }
}
```

### 模板方法与策略模式

模板方法常常用于框架设计中，以确保基类处理流程的逻辑顺序。

当所需要的变化情况多时，要使用策略模式