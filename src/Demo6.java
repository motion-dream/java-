public class Demo6 {
    public static void main(String[] args) {
        int sum = 0,temp=0;
        for (int i=1;i<=20;i++){
            temp=1;
            for (int j=1;j<=i;j++){
                 temp*=j;
            }
            sum+=temp;
        }
        System.out.println("1!+2!+3!+...+20!="+sum);
    }
}
