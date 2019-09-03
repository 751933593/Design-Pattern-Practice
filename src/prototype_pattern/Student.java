package prototype_pattern;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @program: Design-Pattern-Practice
 * @description: 学生类
 * @author: liurunze
 * @create: 2019-08-07 17:59
 **/
public class Student implements Cloneable, Serializable{

    private String name;

    private String age;

    private transient String schoolName;

    public Student studentClone(String schoolName){
        try {
            Student clone = (Student)super.clone();
            clone.schoolName = schoolName;
            return clone;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            throw new InternalError(e);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
