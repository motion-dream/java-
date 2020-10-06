import java.io.*;
import java.util.Locale;

/*
将一个文件数据(datain.txt)数据读入内存，把其中的小写字母转换成大写字
母，其它字符不变，并显示到 JAVA 控制台并写入到文件(dataout.txt)中。
 */
public class Demo46 {
    public static void main(String[] args) throws IOException {
        int length=0;
        File file=new File("datain.txt");
        FileWriter fileWriter=new FileWriter(file);
        FileReader fileReader=new FileReader(file);
        char[] data=new char[100];
        String str=null;
        while((length=fileReader.read(data))>0){
             str=new String(data,0,length);
            System.out.println(str);
        }
//        fileWriter.write(str.toUpperCase());
        fileReader.close();
        fileWriter.close();


    }
}
