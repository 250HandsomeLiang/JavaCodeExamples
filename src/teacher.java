public class teacher extends Person{

    public int grade=100;
    private String father="earth";

//    public teacher(String name,int age){
//        this.name=name;
//        this.age=age;
//    }

    @Override
    public void Print() {
        System.out.println("Teacher");
    }

    public String getName(){
        return this.name;
    }


}
