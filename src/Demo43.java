/*
创建一个 stringbuffer 对象，添加字符串"abcd","efgh","adef","1234"到
对象中，测试对象大小和容量的变化及元素的遍历，删除指定第 5 个位置的字符，
插入一个字符'a'到第 3 个位置，对串进行反转操作。
 */
public class Demo43 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("abcd");
        stringBuffer.append("efgh");
        stringBuffer.append("adef");
        stringBuffer.append("1234");
        System.out.println("容量为"+stringBuffer.capacity());
        stringBuffer.delete(5,5);
        stringBuffer.append("a");
        stringBuffer.reverse();
    }
}
