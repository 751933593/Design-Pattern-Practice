package state_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 电风扇第0档
 * @author: liurunze
 * @create: 2019-08-19 16:23
 **/
public class ZeroLevel implements State{

    @Override
    public State clockWise(Context context) {
        System.out.println("0level -> 1level");
        return context.getFirstLevel();
    }

    @Override
    public State counterClockWise(Context context) {
        System.out.println("0level -> 2level");
        return context.getSecondLevel();
    }

    @Override
    public String toString() {
        return "ZeroLevel";
    }
}
