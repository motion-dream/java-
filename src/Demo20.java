/*
定义一个 Point 类，用来描述三维空间中的点，可以提供具体特定坐标的点对
象，提供设置三个坐标的方法，计算该点到原点距离。并定义一个 Point 的测试
类，去调用 Point 类相应的方法。
 */
class Point{
    double x;
    double y;
    double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point(){
    }
    public double getLength(){
        return Math.sqrt(Math.pow(x,2)*Math.pow(y,2)*Math.pow(z,2));
    }
}
public class Demo20 {
    public static void main(String[] args) {
        Point point=new Point(2,3,4);
        point.getLength();
    }
}
