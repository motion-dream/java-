import java.util.Scanner;

/*
构造 String 类型的二维数组 s，二维数组存的元素是字符串
 */
public class Demo42 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数组行数");
        int n=scanner.nextInt();
        System.out.println("请输入数组列数");
        int m=scanner.nextInt();
        String[][] strings=new String[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                strings[i][j]=n+","+m;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.println(strings[i][j]);
            }
        }
    }
}
