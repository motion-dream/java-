import java.util.Scanner;
/*
创建一个圆类
 */
class Circle{

    private int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public float getArea(){
        return (float) (3.14*Math.pow(this.r,2));
    }
}
public class Demo11 {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入○的半径");
        circle.setR(scanner.nextInt());
        System.out.println("○的面积为"+circle.getArea());
    }
}
