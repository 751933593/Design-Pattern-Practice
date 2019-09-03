package state_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 模拟电风扇开关 0档->1档->2档->0档
 *                  或逆时针转动 0档->2档->1档->0档
 * @author: liurunze
 * @create: 2019-08-13 18:00
 **/
public class Test {

    public static void main(String[] args) {

        System.out.println("构建一个风扇");
        Context context = new Context();

        System.out.println("------------顺时针转动风扇5次------------");
        System.out.println("电风扇当前状态为："+context.getCurrentState());
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"次转动");
            context.clockWise();
            System.out.println("电风扇当前状态为："+context.getCurrentState());
        }


        System.out.println("------------逆时针转动风扇5次------------");
        System.out.println("电风扇当前状态为："+context.getCurrentState());
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"次转动");
            context.counterClockWise();
            System.out.println("电风扇当前状态为："+context.getCurrentState());
        }

    }

}
