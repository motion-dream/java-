import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//输入一批正整数,求其中奇数之和
public class Demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入正整数");
        int i=scanner.nextInt();
        int sum = 0;
        while(i>0){
            if(i%2==1){
                sum+=i;
            }
            i=scanner.nextInt();
        }
        System.out.println("所有奇数之和为"+sum);
    }
}
