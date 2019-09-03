package builder_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-07-19 16:36
 **/
public class Test {

    public static void main(String[] args) {
        // HashMap 用的就是构造器模式
        Map map = new HashMap<String,Object>(1<<5);
        Map map1 = new HashMap<String,Object>(1<<5,0.8F);
        Map map2 = new HashMap<String,Object>();
        Map map3 = new HashMap<String,Object>(map2);

        //建造者模式
        Student student = new Student.StudentBuilder("张三","00001")
                .age("18")
                .sex("男")
                //.telNum("13113513641")
                .build();

        System.out.println(student);

    }


}
