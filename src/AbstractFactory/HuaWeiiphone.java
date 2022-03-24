package AbstractFactory;

public class HuaWeiiphone extends Iphone{
    @Override
    public void start() {
        System.out.println("HuaWei iphone start");
    }

    @Override
    public void shutdown() {
        System.out.println("HuaWei iphone  shutdown");
    }

    @Override
    public void callup() {
        System.out.println("HuaWei iphone callup");
    }

    @Override
    public void sendSMS() {
        System.out.println("HuaWei iphone sendMS");
    }
}
