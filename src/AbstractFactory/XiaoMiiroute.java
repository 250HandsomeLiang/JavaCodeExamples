package AbstractFactory;

public class XiaoMiiroute extends Iroute{
    public void start() {
        System.out.println("XiaoMi iroute start");
    }

    @Override
    public void shutdown() {
        System.out.println("XiaoMi iroute  shutdown");
    }

    @Override
    public void openwifi() {
        System.out.println("XiaoMi iroute openwifi");
    }

    @Override
    public void setting() {
        System.out.println("XiaoMi iroute setting");
    }
}
