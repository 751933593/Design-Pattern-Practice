package flyweight_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-07-18 15:22
 **/
public class Test {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();

        System.out.println("小明：我想要红色的纸");
        System.out.println(factory.getFlyweight("红色的纸"));

        System.out.println("小红：我想要白色的纸");
        System.out.println(factory.getFlyweight("白色的纸"));

        System.out.println("小王：我想要蓝色的纸");
        System.out.println(factory.getFlyweight("蓝色的纸"));

        System.out.println("小张：我想要红色的纸");
        System.out.println(factory.getFlyweight("红色的纸"));
    }
}
