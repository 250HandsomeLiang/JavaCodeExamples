public class Student extends Person{

    public int grade=100;
    private String mother="RPC";
    public  String name;
    public  int age;
    public static int testNum=1;
    static{
        System.out.println("Sb");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        Student.testNum=Student.testNum+1;
        System.out.println("W");
    }

    @Override
    public void Print() {
        System.out.println("Student");
    }
    public String getFatherName(){return super.name;}
    public String getName(){
        return this.name;
    }
}
