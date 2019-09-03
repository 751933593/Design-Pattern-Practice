package observer_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 客户端（测试类）
 * @author: liurunze
 * @create: 2019-07-12 14:39
 **/
public class Client {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("李老师");
        teacher.setAge(28);
        teacher.setTelNumber("110");

        Student student1 = new Student("张三",18);
        Student student2 = new Student("李四",18);

        teacher.attach(student1, teacher.getTelNumber());
        teacher.attach(student2, teacher.getTelNumber());

        System.out.println("老师认领学生后，学生的基本信息：");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        teacher.setTelNumber("120");

        System.out.println("老师的手机号修改为120后，学生的基本信息：");
        System.out.println(student1.toString());
        System.out.println(student2.toString());

        System.out.println("老师让张三离开并且修改手机号为119后，学生的基本信息：");
        teacher.detach(student1);
        teacher.setTelNumber("119");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
    }

}
