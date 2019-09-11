package iterator_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 学生类
 * @author: liurunze
 * @create: 2019-09-05 16:50
 **/
public class Student {

    private String name;
    private String age;

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
