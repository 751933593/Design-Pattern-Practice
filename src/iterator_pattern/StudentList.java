package iterator_pattern;

import java.util.List;
import java.util.function.Consumer;

/**
 * @program: Design-Pattern-Practice
 * @description: 学生集合
 * @author: liurunze
 * @create: 2019-09-05 15:45
 **/
public class StudentList {

    private int currPoint = 0;
    private List studentList;

    public void addList(List list){
        studentList = list;
    }

    public StudentIterator createStudentIterator(){
        return new StudentIterator();
    }

    class StudentIterator<T> implements ListIterator<T>{

        @Override
        public boolean hasNext() {
            if (studentList==null) {
                return false;
            }
            return studentList.size()>currPoint;
        }

        @Override
        public T next() {
            return (T) studentList.get(currPoint++);
        }

        @Override
        public boolean hasPrevious() {
            if (studentList==null) {
                return false;
            }
            return 0<currPoint;
        }

        @Override
        public T preious() {
            return (T) studentList.get(--currPoint);
        }

        @Override
        public void forEachRemaining(Consumer action) {

            while (hasNext()){
                action.accept(next());
            }

        }
    }

}
