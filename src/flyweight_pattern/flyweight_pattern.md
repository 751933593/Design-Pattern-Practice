## 享元模式
### 应用场景
```reStructuredText
（1）不同客户需要相同对象时，不必每个客户都去创建一个对象，而是从池中获取即可
（2）系统中有大量对象时
（3）这些对象消耗大量内存时
（4）这些对象的状态大部分可以外部化（共享）时

```

### 角色
- 享元抽象类
- 享元实现类
- 享元工厂类

### 优势和缺陷

- 优势
  
  1. 大大减少了对象的创建，降低了程序内存的占用，提高效率
- 缺陷
  1. 提高了系统的复杂度。需要分离出内部状态和外部状态，而外部状态具有固化特性，不应该随着内部状态的改变而改变


