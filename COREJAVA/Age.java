import java.util.*;
 class Age {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        System.out.println(sc);
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("not Adult");
        }
    }
}
