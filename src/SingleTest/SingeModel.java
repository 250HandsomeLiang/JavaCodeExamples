package SingleTest;

public class SingeModel {
    private static SingeModel singel1=new SingeModel();
    public String name;
    public static int num=0;

    private SingeModel() {
        SingeModel.num=SingeModel.num+1;
        System.out.println(num);

    }
    public void setName(String name){
        this.name=name;
    }
    public static  SingeModel getSingel1(){
        return singel1;
    }
}
