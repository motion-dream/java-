import java.util.Scanner;

/*
输入一个字符串，求它的长度并输出，之后逆序输出这个字符串
 */
public class Demo32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String string=scanner.next();
        System.out.println("长度为"+string.length());
        System.out.println("反向输出为"+new StringBuilder(string).reverse().toString());
    }
}
