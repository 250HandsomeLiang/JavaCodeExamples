package AbstractFactory;

public class HuaWeiiroute extends Iroute{
    public void start() {
        System.out.println("HuaWei iroute start");
    }

    @Override
    public void shutdown() {
        System.out.println("HuaWei iroute  shutdown");
    }

    @Override
    public void openwifi() {
        System.out.println("HuaWei iroute openwifi");
    }

    @Override
    public void setting() {
        System.out.println("HuaWei iroute setting");
    }
}
