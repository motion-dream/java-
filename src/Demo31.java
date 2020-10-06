import java.util.Arrays;
import java.util.Scanner;

/*
输入三个数，将他们从大到小排列输出。
 */
public class Demo31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] ints=new int[3];
        System.out.println("请输入3个数");
        for(int i:ints){
            i=scanner.nextInt();
        }
        Arrays.sort(ints);
        System.out.println("最大值为"+ints[2]);
    }
}
