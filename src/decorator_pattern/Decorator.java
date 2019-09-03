package decorator_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 抽象修饰者
 * @author: liurunze
 * @create: 2019-08-30 15:25
 **/
public abstract class Decorator extends Component{

    private Component component;

    @Override
    void operate() {
        if (component!=null){
            component.operate();
        }
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
