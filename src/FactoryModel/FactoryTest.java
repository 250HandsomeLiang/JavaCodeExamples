package FactoryModel;

public class FactoryTest {
    public static void main(String[] args){
        FactoryPizzaStore store=new NyPizza();
        store.orderPizza("Cheese");
        store.orderPizza("Greek");

        store=new ChicagoPizza();
        store.orderPizza("Cheese");
        store.orderPizza("Greek");
    }
}
