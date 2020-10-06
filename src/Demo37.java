import java.util.Scanner;

/*
、读入 n 阶方阵 a , 计算该矩阵除副对角线、最后一列和最后一行以外的所
有元素之和.
 */
public class Demo37 {
    static int compute(int[][] ints,int n){
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=ints[i][i];
            sum+=ints[n][i];
            sum+=ints[i][n];
        }
        return sum;
    };
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入几阶方阵");
        int n=scanner.nextInt();
        int[][] ints=new int[n][n];
        System.out.println("计算结果为"+compute(ints,n));
    }
}
