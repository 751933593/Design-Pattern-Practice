package iterator_pattern;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @program: Design-Pattern-Practice
 * @description: 迭代器接口
 * @author: liurunze
 * @create: 2019-09-05 15:32
 **/
public interface ListIterator<T> {

    /**
     * 是否存在下一个
     * @return
     */
    boolean hasNext();

    /**
     * 获得下一个
     * @return
     */
    T next();

    /**
     * 是否存在上一个
     * @return
     */
    boolean hasPrevious();

    /**
     * 获得上一个
     * @return
     */
    T preious();

    /**
     * 遍历剩余的
     * @param action
     */
    void forEachRemaining(Consumer<? super T> action);
}
