public class Inheritance {
    public static void main(String[] args) {
        Human man = new Human();
         man.eat();
         man.walking();
        Shark sh = new Shark();
         sh.color = "blue";
         System.out.println(sh.color);
         sh.eat();
         sh.name();
        Peacock pc = new Peacock();
         pc.name();
         pc.eat();
         pc.fly();
       
      
         }
}
class Animal{
   String color ;
     void eat(){
        System.out.println("Eats");
    }
     void name(){
        System.out.println("Elephant");
    }
}
class Memmal extends Animal{
    int lags ;
    void walking(){
        System.out.println("human");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println(" fish in water ");
    }
}
class Bird extends Animal {
    void fly (){
        System.out.println(" in sky");
    }
}
class Dog extends Memmal{
  void lags(){
      System.out.println(" four");
  }
}
class Human extends Memmal{
   void think(){
    System.out.println("  human is thinking ");
   }
}
class Shark extends Fish{
    void denger (){
        System.out.println(" So Denger ");
    }
}
class Dolfin extends Fish{
    void cute(){
        System.out.println(" So cute");
    }
}
class Peacock extends Bird{
    void white(){
        System.out.println(" white");
    }
}




