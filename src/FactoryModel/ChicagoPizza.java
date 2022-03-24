package FactoryModel;

public class ChicagoPizza extends FactoryPizzaStore {

    public FactoryPizza createPizza(String type) {
        if(type.equals("Cheese")){
            return new CHCheese();
        }
        else if(type.equals("Greek")){
            return new CHGreek();
        }
        else return null;
    }
}
