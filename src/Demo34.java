/*
定义一个数组 int [][]a，初始化元素为 {{1,2},{3,4,5},{6,7,8,9}}，按数组的行和
列输出每个元素
 */
public class Demo34 {
    public static void main(String[] args) {
        int[][] a= {{1,2},{3,4,5},{6,7,8,9}};
        for (int[] i:a){
            for (int n:i){
                System.out.print(n+"  ");
            }
            System.out.println();
        }
    }
}
