package state_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 电风扇开关
 * @author: liurunze
 * @create: 2019-08-19 16:16
 **/
public class Context {

    private State currState;
    private State zeroLevel;
    private State firstLevel;
    private State secondLevel;

    public Context(){
        zeroLevel = new ZeroLevel();
        firstLevel = new FirstLevel();
        secondLevel = new SecondLevel();

        this.currState = zeroLevel;
    }

    public void clockWise() {
        this.currState = this.currState.clockWise(this);
    }

    public void counterClockWise() {
        this.currState = this.currState.counterClockWise(this);
    }

    /**
     * 获取当前电风扇状态
     * @return
     */
    public String getCurrentState(){
        return this.currState.toString();
    }

    public State getZeroLevel() {
        return zeroLevel;
    }

    public State getFirstLevel() {
        return firstLevel;
    }

    public State getSecondLevel() {
        return secondLevel;
    }
}
