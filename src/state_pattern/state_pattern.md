## 状态模式
### 应用场景

```reStructuredText
（1）一个状态只有一个处理方式，没必要使用状态模式。使用if else即可
例如:if(a==1)a=2;else if(a==2)a=3;else if(a==3)a=1
（2）某一个状态下，有不同的不同的处理方式。
例如:
正转：if(a==1)a=2;else if(a==2)a=3;else if(a==3)a=1
反转：if(a==1)a=3;else if(a==2)a=1;else if(a==3)a=2
隔一个转等等
```

### 角色
- Context 环境角色
- State 状态角色
- ConcreteState 具体状态角色

### 优势和缺陷

- 优势
  
  1. 状态对象中有自己的方法标识下一次要切换成哪个状态，新增一个状态时，只需要修改其上一个状态对象中的方法即可
  3. 避免重复写if-else，造成代码块过长，编译出错
  3. 状态都是已知的
  4. 封装了状态对应的规则
- 缺陷
  1. 每一个状态都是一个类，结构复杂

