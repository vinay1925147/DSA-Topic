public class Constructer {
    public static void main( String args []){
    Student  s1 = new Student();
     s1.name = " sati";
     s1.roll = 123;
     s1.pass ="abc";
     s1.marks[0] = 98;
     s1.marks[1] = 94;
     s1.marks[2] = 93;


    Student s2 = new Student (s1);
     System.out.println(s2.name);
     System.out.println(s2.roll);
     System.out.println(s2.pass);
     System.out.println(s2.marks[0] +""+s2.marks[1]+""+s2.marks[2]);
     
 

}
}
class Student {
    String  name ;
    int roll ;
    String pass ;
    int marks[];
     //// copy constructer 
    Student( Student s1){
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.pass = s1.pass;
        this.marks = s1.marks;
    }
    Student(){  /// non parametrrised constructer 
      System.out.println("my name ");
    }
    Student( String name){    /// parametrrised constructer
       this.name = name;
      }
   
    
 }
                  