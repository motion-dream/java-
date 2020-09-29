//输出 1 到 100 之间，所有可以被 3 整除又可以被 7 整除的数。
public class Demo8 {
    public static void main(String[] args) {
        for (int i=0;i<=100;i++){
            if(i%3==0&&i%7==0){
                System.out.println(i);
            }
        }
    }
}
