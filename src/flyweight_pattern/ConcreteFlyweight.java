package flyweight_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 共享享元实现类
 * @author: liurunze
 * @create: 2019-07-18 15:08
 **/
public class ConcreteFlyweight extends Flyweight{


    public ConcreteFlyweight(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operation(String intrinsic) {
        System.out.println("共享的："+intrinsic);
    }

    @Override
    public String toString() {
        return "ConcreteFlyweight{" +
                "extrinsic='" + extrinsic + '\'' +
                '}';
    }
}
