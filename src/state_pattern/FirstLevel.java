package state_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 电风扇第一档
 * @author: liurunze
 * @create: 2019-08-19 16:23
 **/
public class FirstLevel implements State{

    @Override
    public State clockWise(Context context) {
        System.out.println("1level -> 2level");
        return context.getSecondLevel();
    }

    @Override
    public State counterClockWise(Context context) {
        System.out.println("1level -> 0level");
        return context.getZeroLevel();
    }

    @Override
    public String toString() {
        return "FirstLevel";
    }
}
