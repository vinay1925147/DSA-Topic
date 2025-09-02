public class Abstraction {
    public static void main(String args []){
         Hourse h = new Hourse();
         h.eat();
         h.walk();
        //  h.Animal();
        //  Cat c =new  Cat();
        //  c.eat();
        //  c.walk();
          
     }
    
}
 abstract class Animal{
    String color;
    Animal(){
      System.out.println("helloo world");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
    abstract void walk();

}
class Hourse extends Animal {
     void walk() {
        System.out.println("4 lags is walking " );
        }
       Hourse(){
            System.out.println("helloo world1");
          }
}
class Cat extends Animal{
   
    void  walk(){
        System.out.println("2 lags is walking");
    }
}
