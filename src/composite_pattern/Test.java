package composite_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-06-27 16:51
 **/
public class Test {

    public static void main(String[] args) {
        Component root = new Composite("A");

        root.add(new Leaf("B"));
        root.add(new Leaf("C"));

        Component D = new Composite("D");
        D.add(new Leaf("E"));
        D.add(new Composite("F"));

        root.add(D);

        root.display(1);
    }
}
