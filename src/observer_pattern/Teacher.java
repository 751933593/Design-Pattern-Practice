package observer_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 被观察者
 * @author: liurunze
 * @create: 2019-07-12 13:59
 **/
public class Teacher extends Subject{

    private String name;
    private int age;
    private String telNumber;

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
        notifyObservers(telNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelNumber() {
        return telNumber;
    }


}
