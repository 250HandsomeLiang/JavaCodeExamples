package SimpleFactory;

public class SimpleFactoryTest {
    public static void main(String[] args){
        PizzaStroe store=new PizzaStroe();
        Pizza pizza=store.orderPizza("Greek");
    }
}
