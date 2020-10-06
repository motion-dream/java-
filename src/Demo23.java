import java.util.Scanner;
/*
.编写程序计算圆的面积和周长。要求：定义一个 Area_Peri 抽象类，有两个抽
象成员方法 getArea()和 getPerimeter()，分别表示“计算面积”和“计算周长”；再定
义一个 Circle 类，继承 Area_Peri，实现相应的抽象方法。
 */
abstract class Area_Peri{
    abstract double getArea(double r);
    abstract double getPerimeter(double r);
    static class Circle extends Area_Peri{
        double pi=3.14;
        @Override
        double getArea(double r) {
            return pi*Math.pow(r,2);
        }

        @Override
        double getPerimeter(double r) {
            return 2*pi*r;
        }
    }
}
public class Demo23 {
    public static void main(String[] args) {
         Area_Peri area_peri= new Area_Peri.Circle();
         System.out.println("请输入半径");
         Scanner scanner=new Scanner(System.in);
         double r=scanner.nextDouble();
         System.out.println("面积为"+area_peri.getArea(r));
         System.out.println("周长为"+area_peri.getPerimeter(r));
    }
}
