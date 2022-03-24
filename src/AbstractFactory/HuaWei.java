package AbstractFactory;

public class HuaWei extends DigitalFactory{
    @Override
    public Iphone phoneProduct() {
        return new HuaWeiiphone();
    }

    @Override
    public Iroute routerProduct() {
        return new HuaWeiiroute();
    }
}
