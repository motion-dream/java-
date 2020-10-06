/*
创建一个类，为该类定义三个构造函数，分别执行下列操作： 1、传递两个
整数值并找出其中较大的一个值；2、传递三个 double 值并求出其乘积； 3、
传递两个字符串值并检查其是否相同； 4、在 main 方法中测试构造函数的调用。
 */
class Test{
    private int i;
    private int n;
    private int m;
    public Test(int n,int m){
        if (n > m) {
            System.out.println(n);
        }else {
            System.out.println(m);
        }
    }
    public Test(double x,double y,double z){
        System.out.println(x+"*"+y+"*"+z+"="+x*y*z);
    }
    public Test(String x,String y){
        if(x.equals(y)){
            System.out.println(x+"与"+y+"相同");
        }else {
            System.out.println(x+"与"+y+"不相同");
        }
    }
}
public class Demo14 {
    public static void main(String[] args) {
        Test Test=new Test(2,3);
        Test Test1=new Test(2.0,3.0,4.0);
        Test Test2=new Test("abc","abcd");
    }
}
