package bridge_pattern;

/**
 * 抽象层的接口
 */
public abstract class Abstraction {

    private Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}
