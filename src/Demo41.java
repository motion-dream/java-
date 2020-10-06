/*
    两个 3*2 矩阵求和，给定两个 3*2 矩阵（利用二维数组），求和后输出
 */
public class Demo41 {
    public static void main(String[] args) {
        int sum=0;
        int[][] ints={{2,3},{1,2},{4,5}};
        int[][] ints1={{2,3},{1,2},{4,5}};
        for (int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                sum+=ints[i][j]+ints1[i][j];
            }
        }
        System.out.println("数组为"+sum);
    }
}
