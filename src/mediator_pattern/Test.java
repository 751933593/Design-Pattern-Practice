package mediator_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-07-15 13:32
 **/
public class Test {

    public static void main(String[] args) {

        AbstractPerson personA = new PersonA("张三","男");
        AbstractPerson personB = new PersonB("李四","男");

        AbstractMediator mediator = new ConcreteMediator(personA,personB);

        mediator.makeFriend();
    }


}
