import java.io.*;
import java.util.Scanner;

/*
编写程序。请在控制台上输入任意两个数，计算它们的和，并同时输出到控制
台和文件 file.txt
 */
public class Demo44 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入两个数字");
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int sum=n+m;
        File file=new File("file.txt");
        OutputStream f=new FileOutputStream(file);
        f.write(sum);
        System.out.println(sum);
        f.close();
    }
}
