 class Findsubsets {
    public static void subsets(String str , String ans , int i){
        if(i==str.length()) {
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
        }
        subsets(str , ans+str.charAt(i),i+1);
        subsets(str,ans,i+1);
    }
public static void permutations(String str , String ans ){
    if(str.length()==0){
        System.out.println(ans);
    }
    for(int i=0;i<str.length();i++){
        char curr= str.charAt(i);
        String nstr= str.substring(0,i)+str.substring(i+1 );
        permutations(nstr, ans+curr);
    }
}
    public static void main(String args[]){
        String str = "abc";
        // subsets(str,"",0);
        permutations(str,"");
        
    }
}                               