package mediator_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 中介者实现类
 * @author: liurunze
 * @create: 2019-07-15 13:31
 **/
public class ConcreteMediator extends AbstractMediator {

    private AbstractPerson personA;

    private AbstractPerson personB;

    public ConcreteMediator(AbstractPerson a, AbstractPerson b){
        this.personA = a;
        this.personB = b;
    }

    @Override
    void makeFriend() {
        personA.talk();
        personB.talk();
    }
}
