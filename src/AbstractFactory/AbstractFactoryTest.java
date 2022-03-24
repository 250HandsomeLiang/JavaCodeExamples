package AbstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args)
    {
        DigitalFactory factory=new HuaWei();
        Iphone phoneProduct= factory.phoneProduct();
        Iroute irouteProduct= factory.routerProduct();
        phoneProduct.start();
        phoneProduct.shutdown();
        phoneProduct.callup();
        phoneProduct.sendSMS();
        System.out.println("_____________________________________________________________");
        irouteProduct.start();
        irouteProduct.shutdown();
        irouteProduct.openwifi();
        irouteProduct.setting();
        System.out.println("_____________________________________________________________");
        factory=new XiaoMi();
        phoneProduct= factory.phoneProduct();
        irouteProduct= factory.routerProduct();
        phoneProduct.start();
        phoneProduct.shutdown();
        phoneProduct.callup();
        phoneProduct.sendSMS();
        System.out.println("_____________________________________________________________");
        irouteProduct.start();
        irouteProduct.shutdown();
        irouteProduct.openwifi();
        irouteProduct.setting();
    }
}
