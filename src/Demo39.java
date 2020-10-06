/*
给定一个字符串“aWdefEhiACpqrstBDwxyz”，要求输出字符串的大写字母和
小写字母的个数
 */
public class Demo39 {
    public static void main(String[] args) {
        String s="aWdefEhiACpqrstBDwxyz";
        int n=0;
        int m=0;
        for (int i=0;i<s.length();i++){
            if (Character.isUpperCase(s.charAt(i))){
                n++;
            }else {
                m++;
            }
        }
        System.out.println("大写字母个数为"+n+"小写字母个数为"+m);
    }
}
