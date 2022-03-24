package FactoryModel;

public class NyPizza extends FactoryPizzaStore{
    @Override
    public FactoryPizza createPizza(String type) {
        if(type.equals("Cheese")){
            return new NyCheese();
        }
        else if(type.equals("Greek")){
            return new NyGreek();
        }
        else return null;
    }
}
