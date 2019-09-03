package adapter_pattern;

import java.util.HashMap;

/**
 * @program: Design-Pattern-Practice
 * @description: 适配器模式
 * @author: liurunze
 * @create: 2019-06-24 15:49
 **/
public class Test {

    public static void main(String[] args) {

        //类适配器
        ClientLoginInterface clientLoginAdapter = new ClientLoginAdapter();
        clientLoginAdapter.clientLogin("root",123456);

        //对象适配器
        ClientLoginAdapter2 clientLoginAdapter2 = new ClientLoginAdapter2();
        clientLoginAdapter2.clientLogin("root",123456);

    }
}
