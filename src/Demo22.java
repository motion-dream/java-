/*
创建一个长方形类，成员域有长方形的长和宽，成员方法有计算长方形的面
积。在 main 方法中创建长方形类对象，并调用计算长方形面积的方法
 */
class Chuan{
    private int x_size;
    private int y_size;

    public Chuan(int x_size, int y_size) {
        this.x_size=x_size;
        this.y_size=y_size;
    }

    public int getArea(){
        return x_size*y_size;
    }
}
public class Demo22{
    public static void main(String[] args) {
        Chuan chuan=new Chuan(3,4);
        chuan.getArea();
    }
}

