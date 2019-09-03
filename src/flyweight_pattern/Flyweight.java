package flyweight_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 享元模式抽象类
 * @author: liurunze
 * @create: 2019-07-18 14:49
 **/
public abstract class Flyweight {

    public String intrinsic; //内部状态；不会随环境的变化而变化；可共享

    public String extrinsic; //外部状态；会随环境的变化而变化；不可共享

    public Flyweight(String extrinsic){

        this.extrinsic = extrinsic;
    }

    public abstract void operation(String state);

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
