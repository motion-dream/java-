import java.util.Arrays;
import java.util.Scanner;

/*
输入 n 个整数，按升序次序输出这些数。
 */
public class Demo36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入整数个数");
        int n=scanner.nextInt();
        int[] ints=new int[n];
        System.out.println("请输入整数");
        for (int i=0;i<n;i++){
            ints[i]=scanner.nextInt();
        }
        Arrays.sort(ints);
        for (int i:ints){
            System.out.println(i);
        }
    }
}
