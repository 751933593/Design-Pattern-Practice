package observer_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 观察者
 * @author: liurunze
 * @create: 2019-07-12 14:02
 **/
public class Student implements Observer {

    private String name;
    private int age;
    private String teacherTelNumber;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void update(Subject subject, Object object) {

        teacherTelNumber = (String) object;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", teacherTelNumber='" + teacherTelNumber + '\'' +
                '}';
    }
}
