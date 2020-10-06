/*
定义一个 Compare 类，在其中以重载的方式定义两个静态方法（同名），分别
实现求两个整数和三个整数中的最大数，并输出。
 */
class Compare{
    public static int getMax(int x,int y){
        if (x>y){
            return x;
        }else {
            return y;
        }
    }
    public static int getMax(int x,int y,int z) {
        int max = x;
        if (max < y) {
            max = y;
        }
        if (max < z) {
            max = z;
        }
        return max;
    }
}
public class Demo18 {
    public static void main(String[] args) {
        System.out.println(Compare.getMax(2,3));
        System.out.println(Compare.getMax(2,3,4));
    }
}
