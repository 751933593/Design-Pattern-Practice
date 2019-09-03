package adapter_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 类适配器
 * @author: liurunze
 * @create: 2019-06-24 16:33
 **/
public class ClientLoginAdapter extends LoginImpl implements ClientLoginInterface{

    @Override
    public void clientLogin(String username, Integer password) {
        System.out.println("类适配器");
        login(username, String.valueOf(password));
    }
}
