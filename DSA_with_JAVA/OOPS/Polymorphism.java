public class Polymorphism {
    public static void main (String args []){
    //   Calculater cal =  new Calculater();
    //  System.out.println(cal.sum(1,2));
    //  System.out.println(cal.sum((float)1.2,(float)2.3));
    //  System.out.println(cal.sum(1,2));
    Dog  d1 = new Dog ();
    d1.eat();
    Animal a1 = new Dog();
    a1.eat();
    Animal a2 = new Animal();
    a2.eat();
     }
    }
    //// method   overriding 
     class Animal {
        void eat(){
            System.out.println(" eat anything ");
        }
     }
     class Dog extends Animal {
        void eat(){
            System.out.println("eat bread");
        }
     }
     ////  Method overloading
   class Calculater{
    int sum (int a,int b ){
        return a+b;
     }
    float  sum (float  a,float b ){
        return a+b;
     }
     int sum (int a,int b ,int c){
        return a+b+c;
     }
   }
