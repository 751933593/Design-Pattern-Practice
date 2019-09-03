package memento_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 备忘录管理者
 * @author: liurunze
 * @create: 2019-08-08 17:20
 **/
public class MementoManager {

    private Memento memento;

    public MementoManager(Memento memento) {
        this.memento = memento;
    }

    public String getDataTime() {
        return memento.getDataTime();
    }

    public String getAddress() {
        return memento.getAddress();
    }

    public String getPerson() {
        return memento.getPerson();
    }
}
