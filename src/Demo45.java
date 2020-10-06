import com.sun.xml.internal.ws.api.model.ExceptionType;

/*
编写程序。设定两个异常，分别为除数为 0 和数组越界。利用 try…catch…finally
捕获异常，并进行处理，处理时只输出相关提示信息即可。
 */
public class Demo45 {
    public static void main(String[] args) {
        try {
            int i=10;
            System.out.println(i/0);
            int[] x=new int[2];
            System.out.println(x[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw"+ e);
        }catch (ArithmeticException arithmeticException){
            System.out.println("Exception throw"+arithmeticException);
        } finally {
            System.out.println("Exception end");
        }
    }
}
