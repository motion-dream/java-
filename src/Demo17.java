/*
.定义一个 Date 类，包含三个成员变量 year，month，day，分别定义（1）以年
为参数的构造方法，（2）以年和月为参数的构造方法，（3）以年月日为参数的构
造方法。以分别（2016），（2016,10），（2016,10,1）为参数创建三个 Date 对象。
 */
class Date{
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(int year) {
        this.year=year;
    }
    public Date(int year,int month){
        this.year=year;
        this.month=month;
    }

}
public class Demo17 {
    public static void main(String[] args) {
        Date date=new Date(2016);
        Date date1=new Date(2016,10);
        Date date2=new Date(2016,10,1);
    }
}
