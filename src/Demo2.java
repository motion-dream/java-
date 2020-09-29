import java.util.Scanner;
//猜拳游戏
class A{
    private int v=100;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}
public class Demo2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        A a=new A();
        System.out.println("欢迎进行猜字谜游戏");
        System.out.println("请输入你的答案");
        int i=scanner.nextInt();
        while (i!=a.getV()){
            if(i>a.getV()){
                System.out.println("你输入的数值过大");
            }else if(i<a.getV()){
                System.out.println("你输入的数值过小");
            }
            System.out.println("请重新输入");
            i=scanner.nextInt();
        }
        System.out.println("输入正确，恭喜通关");
    }
}
