## 修饰者模式

[修饰者模式]: https://www.cnblogs.com/xinye/p/3910149.html

[修饰者模式]: https://blog.csdn.net/weixin_34175509/article/details/94028130
[修饰者模式]: https://www.cnblogs.com/Vam8023/p/8471260.html

### 应用场景

```reStructuredText
（1）需要将某一对象的功能增强时，（不使用继承），使扩展低耦合、易扩展
```

### 角色
- Decoration抽象修饰者
- ConcreteDecoration具体修饰者
- Component 抽象被修饰者
- ConcreteComponent 具体被修饰者

### 优势和缺陷

- 优势
  
  1. 低耦合。不使用继承增强功能，以组合的方式增强功能。
  2. 易扩展。可以增加具体被修饰者和具体修饰者，符合开闭原则。
  3. 动态增强。具体被修饰者和具体修饰者可以动态组合，或者同一对象被多个修饰者修饰。
- 缺陷
  1. 会创建更多的对象，增加内存
  2. 同一对象被多个修饰者修饰，即修饰者修饰修饰者，增加代码复杂度。

### 修饰者模式与适配器模式

``` reStructuredText
修饰者模式与适配器模式都是包装模式（Warpper），但修饰者与被修饰者具有相同的接口，而适配器和被适配的类具有不同的接口。例如，BufferReader是一个decorator，因为它接受Reader对象；而InputStreamReader接受的是InputStream对象，吧InputStream的API转为Reader的API。半修饰器除了提供被修饰接口的方法外，还提供其他的方法，这就变成了一个半透明的修饰器，如果要使用这些方法，需要使用具体的修饰类。
```














