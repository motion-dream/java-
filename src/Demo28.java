//构造一个二维数组{{4,2},{6,8,1},{7,4}}，输出其中的最大值。
public class Demo28 {
    public static void main(String[] args) {
        int[][] ints={{4,2},{6,8,1},{7,4}};
        int max=ints[0][0];
        for (int[] i:ints){
            for (int n:i){
                if(max<n){
                    max=n;
                }
            }
        }
        System.out.println("最大值为"+max);
    }
}
