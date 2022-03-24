package AbstractFactory;

public class XiaoMiiphone extends Iphone{
    public void start() {
        System.out.println("XiaoMi iphone start");
    }

    @Override
    public void shutdown() {
        System.out.println("XiaoMi iphone  shutdown");
    }

    @Override
    public void callup() {
        System.out.println("XiaoMi iphone callup");
    }

    @Override
    public void sendSMS() {
        System.out.println("XiaoMi iphone sendMS");
    }
}
