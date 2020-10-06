/*
.定义一个 Animal 抽象类，其中有一个成员变量 name（String），还有一个抽象
方法 shout()；定义 Dog 类继承 Animal 类，并实现其中的抽象方法。实例化一个
Dog 对象，并调用它的 shout()方法。

 */
abstract class Animal{
    String name;
    abstract void shout();

}
class Dog extends Animal{
    @Override
    void shout() {
        System.out.println("这个Dog实现的shout方法");
    }
}
public class Demo19 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.shout();
    }
}
