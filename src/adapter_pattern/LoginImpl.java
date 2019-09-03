package adapter_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 登录实现类
 * @author: liurunze
 * @create: 2019-06-24 16:27
 **/
public class LoginImpl implements LoginInterface{


    @Override
    public void login(String username, String password) {
        System.out.println("这是原登录接口所实现的登录功能");
    }
}
