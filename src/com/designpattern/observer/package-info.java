package com.designpattern.observer;
/*
 * 观察者模式：
 * 定义：定义对象间一种一对多的依赖关系，使得当每一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。
 * 类型：行为类模式
 */

/*
 * 结构：
 * (1)被观察者：类中有一个用于存放观察者对象的Vector容器(之所以使用Vector而不是用List，是因为多线程操作时，Vector是安全的，而List是不安全的。)
 * 这个Vector容器是被观察者类的核心，另外还有三个方法：attach方法是向这个容器中添加观察者对象；detach方法是从容器中移除观察者对象；
 * notify方法是依次调用观察者对象的相应方法。这个角色可以是接口，也可以是抽象类或者具体的类，因为很多情况下会与其他的模式混用，所以使用抽象类的情况比较多。
 * (2)观察者：观察者角色一般是一个接口，它只有一个update方法，在被观察者状态发生变化时，这个方法就会被触发调用。
 * (3)具体的被观察者：使用这个角色是为了便于扩展，可以在此角色中定义具体的业务逻辑。
 * (4)具体的观察者：观察者接口的具体实现，在这个角色中，将定义被观察者对象状态发生变化时所要处理的逻辑。
 */

/*
 * 优点：
 * 观察者与被观察者之间是属于轻度的关联关系，并且是抽象耦合的，这样，对于两者来说都比较容易进行扩展。
 * 观察者模式是一种常用的触发机制，它形成一条触发莲，依次对各个观察者的方法进行处理。
 * 但同时，这也算是观察者模式的一个缺点，由于是链式触发，当观察者比较多的时候，性能问题是比较令人担忧的。
 * 并且，在链式结构中，比较容易出现循环引用的错误，造成系统假死。
 */