import java.util.Scanner;
//输出方程2 ax bx c + += 0的根。

public class Demo26 {
    static class Compute{
        private static double[] getSqrt(Double a, Double b, Double c) {
            double x1=((-b+Math.sqrt(b*b-4*a*c))/(2*a));//运用求根公式，并且Math.sqrt()为开平方根
            double x2=((-b-Math.sqrt(b*b-4*a*c))/(2*a));//运用求根公式，并且Math.sqrt()为开平方根
            double[] doubles=new double[2];
            doubles[0]=x1;
            doubles[1]=x2;
            return doubles;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入a,b,c");
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double[] doubles=Compute.getSqrt(a,b,c);
        double x1=doubles[0];
        double x2=doubles[1];
        System.out.println("方程的解为"+x1+" "+x2);
    }
}
