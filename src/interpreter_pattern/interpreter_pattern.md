## 解释器模式

[解释器模式]: https://www.cnblogs.com/zyrblog/p/9253970.html

### 应用场景

```reStructuredText
（1）解析一些具有特定规律的数据集，比如将高级语言解析成汇编语言，
将自定义语言解析成高级语言。而解释器模式，便是将自定义数据集，解析成java对象。
```

### 角色
- Interpreter  抽象解释者
- ConcreteInterpreter  具体解释者 实现 抽象解释者里面的解释方法
- Context 要解释的内容

### 优势和缺陷

- 优势
  
  1. 可以将自定义内容，解析成java对象
  2. 新增功能时，只需要添加具体解释者和上一步的具体解释者调用这个新增的
- 缺陷
  1. 如果内容复杂的话，需要一层一层的解释，其具体解释者角色也会非常复杂










