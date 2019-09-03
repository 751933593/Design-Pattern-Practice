## 原型模式
### 应用场景

```reStructuredText
（1）new对象然后在赋值 成本高于 复制一个对象然后修改。
如果类中属性在复制时不必赋值，则使用transient修饰
```

### 角色
- 原型接口 Prototype
- 原型接口实现类 ConcretePrototype

### 经典例子

```java
public class ArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
     /**
     * Returns a shallow copy of this <tt>ArrayList</tt> instance.  (The
     * elements themselves are not copied.)
     *
     * @return a clone of this <tt>ArrayList</tt> instance
     */
    public Object clone() {
        try {
            ArrayList<?> v = (ArrayList<?>) super.clone();
            // 由于elementData和modCount被transient修饰，所以在深拷贝时不会将该属性赋值
            v.elementData = Arrays.copyOf(elementData, size);
            v.modCount = 0;
            return v;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            // 如果该类实现Cloneable，则不应该出现CloneNotSupportedException
            throw new InternalError(e);
        }
    }
}
```



### 优势和缺陷

- 优势
  
  1. 可以解决构建复杂对象的资源消耗问题，能再某些场景中提升构建对象的效率
  2. 保护性拷贝，可以通过返回一个拷贝对象的形式，实现只读的限制
  3. 解决使用者和具体类之间的耦合
- 缺陷
  1. 每个类都要重写克隆方法，考虑那些属性/方法需要/不需要克隆


