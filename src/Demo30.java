/*
5.定义一个 Date 类，包含三个 int 型成员变量 year，month，day，定义以这三个
成员变量赋值为参数的构造方法。定义一个长度为 30 的 Date 数组 days[]，以 2016
年 10 月的 30 天为值初始化数组，最后顺序输出数组中的每个元素，
 */
class Data{
    int year;
    int month;
    int day;

    public Data(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
public class Demo30 {
    public static void main(String[] args) {
        Data[] data=new Data[30];
        int year=2016;
        int month=10;
        for (int day=1;day<data.length;day++){
            data[day-1].day=day;
            data[day-1].month=month;
            data[day-1].year=year;
        }
        for (Data data1:data){
            System.out.println(data1.year+"年"+data1.month+"月"+data1.day+"日");
        }
    }
}
