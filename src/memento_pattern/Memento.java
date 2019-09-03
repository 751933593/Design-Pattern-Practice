package memento_pattern;

import java.io.Serializable;

/**
 * @program: Design-Pattern-Practice
 * @description: 备忘录
 * @author: liurunze
 * @create: 2019-08-08 17:19
 **/
public class Memento implements Serializable{

    private String dataTime; // 时间

    private String address; // 地点

    private String person; // 人物

    public Memento(String dataTiem, String address, String person) {
        this.dataTime = dataTiem;
        this.address = address;
        this.person = person;
    }

    public String getDataTime() {
        return dataTime;
    }

    public String getAddress() {
        return address;
    }

    public String getPerson() {
        return person;
    }
}
