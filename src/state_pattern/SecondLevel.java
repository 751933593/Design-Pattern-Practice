package state_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 电风扇第2档
 * @author: liurunze
 * @create: 2019-08-19 16:23
 **/
public class SecondLevel implements State{

    @Override
    public State clockWise(Context context) {
        System.out.println("2level -> 0level");
        return context.getZeroLevel();
    }

    @Override
    public State counterClockWise(Context context) {
        System.out.println("2level -> 1level");
        return context.getFirstLevel();
    }

    @Override
    public String toString() {
        return "SecondLevel";
    }
}
