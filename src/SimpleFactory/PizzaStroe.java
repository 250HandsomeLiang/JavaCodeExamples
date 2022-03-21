package SimpleFactory;

public class PizzaStroe {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza=SimpleFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
