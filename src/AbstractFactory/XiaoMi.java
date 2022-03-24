package AbstractFactory;

public class XiaoMi extends DigitalFactory {
    @Override
    public Iphone phoneProduct() {
        return new XiaoMiiphone();
    }

    @Override
    public Iroute routerProduct() {
        return new XiaoMiiroute();
    }
}
