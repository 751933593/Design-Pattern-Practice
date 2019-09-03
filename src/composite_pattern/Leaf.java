package composite_pattern;

import java.util.Collections;
/**
 * @program: Design-Pattern-Practice
 * @description: 个体类（相当于“树叶”）
 * @author: liurunze
 * @create: 2019-06-27 11:19
 **/
public class Leaf implements Component {

    private static String name;

    public Leaf(String name){
        this.name = name;
    }

    @Override
    public void add(Component com) {
        System.out.println("无法新增");
    }

    @Override
    public void remove(Component com) {
        System.out.println("无法删除");
    }

    @Override
    public void display(int depth) {
        System.out.println(String.join("", Collections.nCopies(depth, "-")) + name);
    }

}
