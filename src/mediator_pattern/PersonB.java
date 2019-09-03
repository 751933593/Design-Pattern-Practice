package mediator_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 具体同事类B
 * @author: liurunze
 * @create: 2019-07-15 11:12
 **/
public class PersonB extends AbstractPerson {

    public PersonB(String name, String sex){
        super.name = name;
        super.sex = sex;
    }

    @Override
    void talk() {
        System.out.println("我是"+name+"，我们做朋友吧！");
    }
}
