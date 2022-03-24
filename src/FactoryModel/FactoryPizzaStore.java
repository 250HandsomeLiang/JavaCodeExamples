package FactoryModel;

public abstract class  FactoryPizzaStore {
    FactoryPizza pizza;
    public FactoryPizza orderPizza(String type){
        pizza=createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("_______________________________________________________________________");
        return pizza;
    }
    public abstract FactoryPizza createPizza(String type);
}
