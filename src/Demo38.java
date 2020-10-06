import java.util.Scanner;

/*
输入 m 行 n 列矩阵 a 中的元素，分别求出各行元素之和, 并存入一维数组
row 中, 再输出 row
 */
public class Demo38 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入矩阵的行");
        int n=scanner.nextInt();
        System.out.println("请输入矩阵的列");
        int m=scanner.nextInt();
        int[][] ints=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                ints[i][j]=scanner.nextInt();
            }
        }

        int[] row=new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            sum=0;
            for (int j=0;j<m;j++){
                sum+=ints[i][j];
            }
            row[i]=sum;
        }
        for (int i=0;i<n;i++){
            System.out.println("sum of row "+i+"is"+row[i]);
        }
    }
}
