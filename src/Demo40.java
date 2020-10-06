import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
给定长度为 10 的一维 int 数组 a，随机存放 0~9 个 int 数，使用排序算法，将
数组中的元素按从小到大的顺序排列好，并输出。对排序好的数据，使用查找算
法，找到数组 a 中的某个 int 数。
 */
public class Demo40 {
    public static void main(String[] args) {
        int[] ints=new  int[10];
        for (int i=0;i<10;i++){
            ints[i]= (int) Math.random();
        }
        Arrays.sort(ints);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你需要查找的数");
        int n=scanner.nextInt();
        if(Arrays.binarySearch(ints,n)<0){
            System.out.println("该数组不存在"+n);
        }else {
            System.out.println("该数组存在"+n+"该数组的位置为"+Arrays.binarySearch(ints,n));
        }


    }
}
