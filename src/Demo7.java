import java.util.Scanner;

//编写一个 java 程序。给定一个正整数，判定它是否为素数并输出。
public class Demo7 {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        int count=0;
        for(int n=1;n<=i;n++){
            if(i%n==0){
                count++;
            }
        }
        if (count>2){
            System.out.println(i+"不是素数");
        }else {
            System.out.println(i+"是素数");
        }
    }

}
