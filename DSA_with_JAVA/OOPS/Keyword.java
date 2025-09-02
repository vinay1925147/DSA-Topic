public class Keyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.color);
    //     s1.setName("viany");
    //     System.out.println(s1.getName());
    //     s1.sch_name = " gns";
    //     System.out.println(s1.sch_name);
    //     Student s2 = new Student();
    //     System.out.println(s2.sch_name);
    // System.out.println( s1.perchantge(67,23,56));
    // System.out.println( s2.perchantge(67,78,56));
    }
    
}
class Teacher {
    String color ;
   static  String sname;
    Teacher(){
        System.out.println("teaching ");
    }
}
class Student  extends Teacher {
     Student(){
       super.color = " pink";
      System.out.println("student is reading" );

 }
//     String name;
//     int rollno;
//     //////Static keyword 
//     static String  sch_name;
//     String getName(){
//         return this.name ;
//     }
//     void setName (String name  ){
//         this.name = name ;
//  }
//   static int  perchantge(int math ,int phy ,int chem){
//       return  (math+phy+chem) /3;
//        }
    }

