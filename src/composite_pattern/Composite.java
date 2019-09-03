package composite_pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 组合类（相当于“树枝”）
 * @author: liurunze
 * @create: 2019-06-27 11:14
 **/
public class Composite implements Component{

    private String name;
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name){
        this.name = name;
    }

    @Override
    public void add(Component com) {
        children.add(com);
    }

    @Override
    public void remove(Component com) {
        children.remove(com);
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "-")) + name);
        for (Component component : children){
            component.display(depth+2);
        }

    }
}
