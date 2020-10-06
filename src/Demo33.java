/*
定义一个存储 9*9 乘法表的数组，赋值并输出
 */
public class Demo33 {
    public static void main(String[] args) {
        String[][] strings=new String[9][9];
        for (int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                strings[i-1][j-1]=i+"*"+j+"="+i*j;
            }
        }
        for (String[] strings1:strings){
            for (String string:strings1){
                System.out.println(string);
            }
        }
    }
}
