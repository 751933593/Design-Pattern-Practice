## 备忘录模式
### 应用场景

```reStructuredText
（1）将对象或对象中的属性保存起来(内存/本地)，需要恢复时再拿出来
```

### 角色
- Memento 备忘录
- MementoManager 备忘录管理者
- Originator 需要被记录对象

### 优势和缺陷

- 优势
  
  1. 数据安全。备忘录管理员角色管理备忘录，管理员只能使用备忘录的部分数据，只有原对象才可以使用自己的备忘录
  3. 数据恢复。
  3. 快照、按版本读
- 缺陷
  1. 安全问题。自己的记录也可以给别人用

