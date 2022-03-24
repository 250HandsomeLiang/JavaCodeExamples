public abstract  class Person {
   private String country="China";
   String name="Tianxia";
   int age;

   Person(){
      System.out.println("Yes");
   }


   public abstract void Print();
   public void isPerson(){
       System.out.println("I'm a person");
   }
   public void PrintName(){
      System.out.println(this.name);
   }

}



