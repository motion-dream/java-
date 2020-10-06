/*
.定义一个类 Secret，其中有一个私有成员变量 （s String），值为”我是一个秘密”。
定义一个包含 main 方法的测试类 TestSecret，实例化一个 Secret 对象并输出它的
s
 */
class Secret{
    private String s;
    public Secret(){
        this.s="我是一个秘密";
    }
    public String getS(){
        return s;
    }
}
public class Demo29 {
    public static void main(String[] args) {
        Secret secret=new Secret();
        System.out.println(secret.getS());
    }
}
