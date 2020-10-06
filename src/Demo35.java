import java.util.Scanner;

/*
写一个方法判断一个字符串是否对称。
 */
public class Demo35 {
    public static boolean judement(String s){
        int n=s.length();
        int count=0;
        if(n%2!=0){
            n=n-1;
        }

        for (int i=0;i<n;i++){
            if(s.charAt(i)==s.charAt(s.length()-i)){
                count++;
            }
        }
        if(count/2<=n/2) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        while (judement(s)){
            System.out.println(s+"是对称的");
        }
    }
}
