public class RomenNo {
    public static int value(char r){
        if(r=='I'){
            return  1;
        }
        if(r=='V'){
            return  5;
        }
        if(r=='X'){
            return  10;
        }
        if(r=='L'){
            return  50;
        }
        if(r=='C'){
            return  100;
        }
        if(r=='D'){
            return  500;
        }
        if(r=='M'){
            return  1000;
        }
    return -1;
 }
    public static int romenTOnumber(String str){
        int result=0;
        for(int i=0;i<str.length();i++){
          
            int s1 = value(str.charAt(i));
           
            if(str.length()>i+1)
            {
             int s2 = value(str.charAt(i+1));
              if(s1>=s2){//add
                 result +=s1;
             }
             else{//subtract
               result += (s2-s1);
               i++;
             }
            }
            else{
             result += s1;
             }
         }
         return result;
    }
    public static void main(String args[]){
        String str="CMXCIX";
     System.out.println(romenTOnumber(str));
    }
}
