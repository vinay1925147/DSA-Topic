public class Duplication {
    public static int  power(int a , int n){
        if(n==0){
        return 1;
       }
       int p=power(a, n-1);
        int  p1= a*p;
        return p1;
    }
    public static void removeDuplicate(String str, StringBuilder newstr ,int idx , boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return ;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a'] == true){
            removeDuplicate(str, newstr, idx+1, map); 
        }else{
            map[currchar - 'a'] = true;
            removeDuplicate(str, newstr.append(currchar), idx, map);
}
    }
    public static int digitSum(int num){
        // int sum = 0;
        // int count =0;
        // while(num>0){
        //     sum = sum + (num%10);
        //     num = num/10;
        // }
        // System.out.println(count);
        // return sum;
        if(num==0){
            return 0;
        }
        return num%10 + digitSum(num/10);
    }

    public static void substring (String str1 ){
     
        for(int i=0;i<str1.length();i++){
          for(int j=i; j<str1.length();j++){
             for(int k= i; k<=j;k++){
                if(str1.charAt(i)==str1.charAt(j))
                System.out.print(" "+str1.charAt(k));
            } 
           System.out.println();
        }
   }
 }
    public static void main (String args[]){
        int num ='c' - 'a';// type conversion in expression
        // System.out.println(inr);
        String  str = "appnnacollege";
        StringBuilder newstr = new StringBuilder(" ");
       boolean map[] = new boolean[26];
        removeDuplicate(str, newstr, 0,map);
    //     System.out.println(str.length());
        // String str1 = "aba";
        // substring(str1);
        // int  num = 123;
        // System.out.println(digitSum(num));
    //  System.out.println(power(2, 12));

          

    }
    
}
