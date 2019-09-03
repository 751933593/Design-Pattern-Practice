package prototype_pattern;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-08-07 18:05
 **/
public class Test {

    public static void main(String[] args) {

        // 创建一个复杂对象
        Student student = new Student();
        student.setName("张三");
        student.setAge("18");
        student.setSchoolName("第一中学");
        System.out.println("创建一个复杂对象"+student);

        // 克隆这个复杂对象
        Student studentClone = student.studentClone("第十七中学");
        System.out.println("克隆后的对象"+studentClone);
        System.out.println(student);
    }
}
