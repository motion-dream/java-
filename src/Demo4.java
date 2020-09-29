import java.util.Scanner;

//通过键盘输入一个数控制输出星的行数
public class Demo4 {
    public static void main(String[] args) {
        System.out.println("请输入行数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for (int m=1;m<=n-i;m++){
                System.out.print(" ");
            }
            for (int m=1;m<=i*2-1;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
