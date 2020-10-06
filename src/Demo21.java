/*
.构造一个 Person 类，要求包含 id（long 类型）和 name（String 类型）两
个成员域。构造 Studen 类继承 Person 类，Student 类中包含 school（String 类
型）成员域。这两个类中的成员域的访问控制方式都为私有模式（即 private）。
要求：
（1）写出 Person 类的带参数的构造方法，初始化 id 和 name；
（2）写出 Student 类的带参数的构造方法初始化 id，name，school。
 */
public class Demo21 {
    static class Person{
        private long id;
        private String name;

        public Person(long id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    static class Student extends Person{
        private String school;

        public Student(long id, String name) {
            super(id, name);
        }

        public Student(long id, String name, String school) {
            super(id, name);
            this.school = school;
        }
    }
    public static void main(String[] args) {
        Student Student=new Student(1,"路飞","海贼王");
    }
}
