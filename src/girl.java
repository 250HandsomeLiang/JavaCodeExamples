import TestTry.FatherClass;
import TestTry.MotherClass;
import mutli_Extends_interface.Daughter;

public class girl implements Daughter {

    @Override
    public void Beautiful() {
        System.out.println("Beautiful");
    }

    @Override
    public void Strong() {
        System.out.println("Strong");
    }

    @Override
    public void smart() {
        System.out.println("smart");
    }

    public class FatherInner extends FatherClass{
        public int Strong(){
            return super.Strong()+1;
        }
    }

    public class MotherInner extends MotherClass {
        public int Strong(){
            return super.Smart()+1;
        }
    }

    public int Strong1(){
        return new FatherInner().Strong();
    }

    public int Smart1(){
        return new MotherInner().Smart();
    }
}
