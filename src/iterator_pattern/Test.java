package iterator_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Design-Pattern-Practice
 * @description: 测试类
 * @author: liurunze
 * @create: 2019-09-05 17:00
 **/
public class Test {

    public static void main(String[] args) {

        List list = new ArrayList<Student>(){{
            add(new Student("张三","18"));
            add(new Student("李四","16"));
            add(new Student("王五","17"));
        }};

        StudentList studentList = new StudentList();
        studentList.addList(list);

        StudentList.StudentIterator studentIterator = studentList.createStudentIterator();

        System.out.println("============迭代器正序遍历===========");
        while (studentIterator.hasNext()){
            System.out.println(studentIterator.next());
        }

        System.out.println("============迭代器倒序遍历===========");
        while (studentIterator.hasPrevious()){
            System.out.println(studentIterator.preious());
        }

        System.out.println("============迭代器正序遍历剩下的===========");
        studentIterator.next();
        studentIterator.forEachRemaining(System.out::println);

    }
}
