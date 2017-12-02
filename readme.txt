dagger2

三个东西

1, Module 类(我理解是对象工厂，生产对象的地方)


2, Component 接口(管理module 与 对象引用类关联,将使用者对象传给它, inject(MainActivity.this))


3, 使用者(Activity), 需要注入一个对象(Inject)Cloth, 通过component组件来帮我生成


至于如何生成引用对象实例，首先从module中找方法(由返回值类型来确定,所以一般情况下，
同一个返回值的函数只有一个，当然可以Name注解多个)，

两种方式实例化，一种在module类中，一种在类的构造函数中，寻找实例化方法，有先后顺序
先在module中找，然后在类中找构造函数是否有inject


注意事项:
1, component函数不能使用基类,比如activity
2, Scope注解必须用在module类provide方法上，而且component
   必须使用同一个注解,如果module类中任何一个provide方法上有
   scope注解，那么component必须使用同一个注解



dagger 2 依赖注入对象，你只需要声明引用，告诉dagger2怎么生成，生成多少个对象，对象
的作用域,这就是dagger2的价值,对了还有延迟实例化对象lazy

单例是指在同一个component实例下才生效

单例是在同一个Component实例提供依赖的前提下才有效的

subcomponent 父组件一定声明自己能生成什么样的实例，不能看module，
scope和module类provide方法或者类的构造函数一样


dagger2 DI依赖注入

三个东西

依赖需求方(activity), component(depence,subcomponent), module



