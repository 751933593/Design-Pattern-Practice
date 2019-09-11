## 迭代器模式

[迭代模式]: https://www.cnblogs.com/yangxiaojie/p/10205208.html

### 应用场景

```reStructuredText
（1）将不同的集合，这些集合结构不同，但存储的内容相同，放在迭代器中共同管理
（2）只提几种方法操作集合，不希望展示集合内部结构
```

### 角色
- Collection 集合
- Iterator 抽象迭代器
- ConcreteIterator 具体迭代器

### 优势和缺陷

- 优势
  
  1. 支持已不同的方法遍历同一集合
  2. 容器对象可同时进行不同的遍历，因为迭代器记录了当前状态
  3. 使用不同的迭代器，可以增强对集合的操作，例如SpilIterator、ListIterator
- 缺陷
















