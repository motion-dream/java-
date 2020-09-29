//编写程序显示100到1000之间能被5和6整除的数
public class Demo1 {
    public static void main(String[] args) {
        for (int i=100;i<=1000;i++){
            if(i%5==0&&i%6==0){
                System.out.println(i);
            }
        }
    }
}

