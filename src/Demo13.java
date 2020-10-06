/*
3.编写 Java 程序，用于显示人的姓名和年龄。 定义一个人类（Person），该类中
应该有两个私有属性，姓名（name）和年龄（age）。定义构造方法，用来初始化
数据成员。再定义显示（display）方法，将姓名和年龄打印出来。 在 main 方法
中创建人类的实例，然后将信息显示
 */
public class Demo13 {
    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String display() {
            return "name=" + name +"age=" + age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person person=new Person("路飞",19);
        System.out.println(person.display());
    }
}
