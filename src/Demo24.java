import java.util.Scanner;
/*
.编写一个计算图形面积和周长的程序，程序能够计算并输出正方形和圆形的
面积和周长。以面向对象的程序设计方法编写程序，应当至少包括 3 个类，正方
形类，圆形类和测试类（主控程序类）。为了考虑程序的未来扩展，要求先定义
这几种图形共同的父接口 Shape（Shape 表示图形），在 Shape 中定义计算面积和
周长的方法。
 */
interface Shape{
    public double getArea(double r);
    public double getLenth(double r);
}
class Zhen implements Shape{

    @Override
    public double getArea(double r) {
        return r*r;
    }

    @Override
    public double getLenth(double r) {
        return r*4;
    }
}
class Cicle implements Shape{
    double pi=3.14;
    @Override
    public double getArea(double r) {
        return pi*Math.pow(r,2);
    }

    @Override
    public double getLenth(double r) {
        return pi*r*2;
    }
}
public class Demo24 {
    public static void main(String[] args) {
        Shape shape= new Zhen();
        System.out.println("请输入正方形边长");
        Scanner scanner=new Scanner(System.in);
        double r=scanner.nextDouble();
        System.out.println("面积为"+shape.getArea(r));
        System.out.println("周长为"+shape.getLenth(r));
        System.out.println("请输入圆形半径");
        Shape shape1=new Cicle();
        r=scanner.nextDouble();
        System.out.println("面积为"+shape.getArea(r));
        System.out.println("周长为"+shape.getLenth(r));
    }
}
