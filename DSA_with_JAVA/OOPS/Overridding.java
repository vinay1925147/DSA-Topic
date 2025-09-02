public class Overridding {
     public static void main (String args []){
        Bank b ;
         b = new SBI();
        System.out.println(b.intrast());
         b = new ICICI();
        System.out.println(b.intrast());

     }
}
class Bank {
      float intrast(){
        return 0;
    }
}
class SBI extends Bank {
  float  intrast(){
    return 8.4f;
 }
}
class ICICI extends Bank {
    float  intrast(){
      return 7.6f;
   }
}
