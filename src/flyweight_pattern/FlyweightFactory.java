package flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Design-Pattern-Practice
 * @description: 工厂
 * @author: liurunze
 * @create: 2019-07-18 15:15
 **/
public class FlyweightFactory {

    Map<String, Flyweight> map = new HashMap<>();

    Flyweight flyweight = null;

    public Flyweight getFlyweight(String extrinsic) {

        if (map.containsKey(extrinsic)) {
            flyweight = map.get(extrinsic);
            System.out.println("已存在："+extrinsic+"，从池中取出");
        } else {
            flyweight = new ConcreteFlyweight(extrinsic);
            map.put(extrinsic, flyweight);
            System.out.println("不存在："+extrinsic+"，放入池中。");
        }

        return flyweight;
    }
}
