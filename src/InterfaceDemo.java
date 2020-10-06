/*
创建一个名称为 Vehicle 的接口，在接口中添加两个带有一个参数的方法 start()
和 stop()。在两个名称分别为 Bike 和 Bus 的类中实现 Vehicle 接口。创建一个名
称为 interfaceDemo 的类，在 interfaceDemo 的 main()方法中创建 Bike 和 Bus 对
象，并访问 start()和 stop()方法。
 */
interface Vehicle{
    void start();
    void stop();
}
class Bike implements  Vehicle{
    @Override
    public void start() {
        System.out.println("接口start方法被Bike实现");
    }

    @Override
    public void stop() {
        System.out.println("接口stop方法被Bike实现");
    }
}
class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("接口start方法被Bus实现");
    }

    @Override
    public void stop() {
        System.out.println("接口stop方法被Bus实现");
    }
}
public class InterfaceDemo{
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.start();
        bike.stop();
        Bus bus=new Bus();
        bus.start();
        bus.stop();
    }
}
