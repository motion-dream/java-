import java.util.Scanner;
/*
创建一个三角行类
 */
class Delta{
    private float x;
    private float y;
    private float z;
    private float p;

    public Delta() {
    }

    public Delta(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.p= (float) ((x+y+z)/2.0);
    }
    public float getAear(){
        return (float) (0.25*(Math.sqrt(p*(p-x)*(p-y)*(p-z))));
    }

    public float getLength() {
        return (float) x+y+z;
    }
}
public class Demo12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入三边长");
        float x=scanner.nextFloat();
        float y=scanner.nextFloat();
        float z=scanner.nextFloat();
        Delta delta=new Delta(x,y,z);
        System.out.println("三角形的面积为"+delta.getAear());
        System.out.println("三角形的周长为"+delta.getLength());
    }
}
