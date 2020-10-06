import java.util.Scanner;
//从键盘上输入 10 个数存放于数组 a 中，编写程序将数组 a 中的数逆序存放，并输出
public class Demo27 {
    public static void main(String[] args) {
        int[] ints=new int[10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入10个元素");
        for (int a=0;a<ints.length;a++){
            ints[a]=scanner.nextInt();
        }
        int[] ints1=new int[10];
        int n=0;
        for (int i:ints){
            ints1[10-n]=i;
            n++;
        }
        ints=ints1;
        for (int i:ints){
            System.out.println(i);
        }
    }
}
