package state_pattern;

public interface State {

    //顺时针
    State clockWise(Context context);

    //逆时针
    State counterClockWise(Context context);

}
