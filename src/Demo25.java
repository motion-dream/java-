/*
.构造一个学生父类，要求包含 no 和 name 两个成员域。构造大学生子类继承
该学生父类，大学生子类中包含 age 成员域和 printinfo()方法输出 id，name 和 age；
 */
class Father{
    int id;
    String name;
    public  Father(){
        this.id=1;
        this.name="路飞";
    }
}
class Student extends Father{
    private int age;
    public Student(){
        this.age=19;
    }
    public void printinfo(){
        System.out.println(id+"\n"+name+"\n"+age);
    }
}
public class Demo25 {
    public static void main(String[] args) {
        Student student=new Student();
        student.printinfo();
    }
}
