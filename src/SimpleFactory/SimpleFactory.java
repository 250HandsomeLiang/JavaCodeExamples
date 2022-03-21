package SimpleFactory;

public class SimpleFactory {


    public static Pizza createPizza(String type){
        if(type.equals("Cheese"))
        {
            return new Cheese();
        }
        else if(type.equals("Greek"))
        {
            return new Greek();
        }
        else return null;
    }
}
