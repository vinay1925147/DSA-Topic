public class Encapsulation {
    public static void main (String args[]){
//////// To test the encapsulated class 
        Account Ac = new Account(2);
        Ac.setacc_no(335643322);
        System.out.println("my account no. is :"+Ac.getacc_no());
        Ac.setname("vinay asati");
        System.out.println(Ac.getname());
        Ac.setemail("vinayasati90@ail.com");
        System.out.println(Ac.getemail());
        Ac.setammont(50000);
        System.out.println(Ac.getamount());
    }
    
}
/////////// creat encapsulated class in single unit 
class Account {
    private long acc_no;
    private String name , email;
    private  float amount;
       Account(int num){
        System.out.println("sati");
       }
     long getacc_no(){
        return acc_no;
    }
     void setacc_no(long acc_no){
        this.acc_no = acc_no;
     } 
     String getname(){
        return name ;
     }
     void setname(String name ){
        this.name = name ;
     }
     String getemail(){
        return email ;
     }
     void setemail(String email){
        this.email = email ;
     }
     float getamount (){
        return amount ;
     }
     void setammont( float amount){
        this.amount = amount;
     }


}
