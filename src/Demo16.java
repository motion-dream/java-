/*
编写 Java 程序，模拟简单的计算器。 定义名为 Number 的类，其中有两个整
型数据成员 n1 和 n2，应声明为私有。编写构造方法，赋予 n1 和 n2 初始值，再
为该类定义加（addition）、减（subtration）、乘（multiplication）、除（division）
等公有成员方法，分别对两个成员变量执行加、减、乘、除的运算。 在 main
方法中创建 Number 类的对象，调用各个方法，并显示计算结果
 */
class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int addition(){
        return n1+n2;
    }
    public int subtration(){
        return n1-n2;
    }
    public int multiplication(){
        return n1*n2;
    }
    public double division(){
        return n1/n2;
    }
}
public class Demo16 {
    public static void main(String[] args) {
        Number number=new Number(4,5);
        number.addition();
        number.division();
        number.multiplication();
        number.subtration();
    }
}
