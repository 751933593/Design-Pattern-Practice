package adapter_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 对象适配器
 * @author: liurunze
 * @create: 2019-06-24 16:33
 **/
public class ClientLoginAdapter2 implements ClientLoginInterface{

    private LoginImpl loginImpl = new LoginImpl();

    @Override
    public void clientLogin(String username, Integer password) {
        System.out.println("对象适配器");
        loginImpl.login(username, String.valueOf(password));
    }
}
