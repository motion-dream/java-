import java.util.Scanner;
//应用题
public class Demo5 {
    public static  void main(String[] args) {
        //出现未知乱码问题
        //System.out.println("请输入当月利润");
        System.out.println("\u8bf7\u8f93\u5165\u5f53\u6708\u5229\u6da6");
        Scanner scanner=new Scanner(System.in);
        float money=scanner.nextFloat();
        float sum=0;
        if(money<=100000) sum = (float) (money * (1 + 0.1));
        else if(money<=200000) sum = (float) ((money - 100000) * (1 + 0.075) + 100000 * (1 + 0.1));
        else if(money<=400000) sum = (float) ((money-200000)*(1+0.05)+100000*(1+0.075)+100000 * (1 + 0.1));
        else if(money<=600000) sum = (float) ((money-400000)*(1+0.03)+200000*(1+0.5)+100000*(1+0.075)+100000 * (1 + 0.1));
        else if(money<=1000000) sum= (float) ((money-600000)*(1+0.015)+200000*(1+0.3)+200000*(1+0.5)+100000*(1+0.075)+100000 * (1 + 0.1));
        else sum=(float) ((money-1000000)*(1+0.01)+400000*(1+0.015)+200000*(1+0.3)+200000*(1+0.5)+100000*(1+0.075)+100000 * (1 + 0.1));
        //出现未知乱码问题
        //System.out.println("当月利润"+sum);
        System.out.println("\u5f53\u6708\u5229\u6da6\u4e3a" +sum);
    }
}
