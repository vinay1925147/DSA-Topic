 class Strcompresion {
    public static  String  compresion1(String str){
        StringBuffer  sb = new StringBuffer(" ");
        for (int i=0; i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                 count ++;
                 i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
             sb.append(count);
             
            }

        }
        return sb.toString();

    }
    public static String compresion(String str ){
        String newstr = "";
        for(int i=0; i<str.length();i++){
            Integer count = 1;
            while (  i<str.length()-1 &&str.charAt(i)== str.charAt(i+1) ){
                count++;
                i++;
             }
            newstr += str.charAt(i);
            if(count>1) {
              newstr += count.toString();
            }
         }
        return newstr ;
    }
    public static void main(String[] args) {
        String str  = "abbcdeeeffffgg";
        //System.out.println(compresion(str));
         System.out.println(compresion1(str));
    }
}
