package visitor_pattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: Design-Pattern-Practice
 * @description:
 * @author: liurunze
 * @create: 2019-07-04 10:08
 **/
public class Test {

    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("caseStatus","-1");

        System.out.println(Short.valueOf(map.get("caseStatus").toString()));
    }
}
