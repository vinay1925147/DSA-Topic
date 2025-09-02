import java.util.*;
public class Problem1 {
    public static void removeDuplicate(int arr[]){
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i:arr){
            if(map.get(i)==null){
                System.out.println(i);
            }
            map.put(i,true);
        }
    }
    public static void find_Majority(int arr[]){
        HashMap<Integer,Integer>  hm =new HashMap<>();
        for(int i=0;i<arr.length;i++){
              Integer num = arr[i];
            // if(hm.containsKey(num)){
            //     hm.put(num,hm.get(num)+1);
            // } else {
            //     hm.put(num,1);
            //  }
         hm.put(num, hm.getOrDefault(num,0)+1);
        }
        // Set<Integer> keys =hm.keySet();
        for(Integer i: hm.keySet()){
            if(hm.get(i)>(arr.length/3)){
                System.out.println(i);
            }
        }
    }
    public static boolean isAnagram(String s ,String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1);
         } 
         for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }else{
                    map.put(ch,map.get(ch)-1);
                }
            } 
            
            else{
                return false;
            }
         }
         return map.isEmpty();
    } 
    public static void main(String args[]){
     int arr[]={1,2,3,4,1,2,3,4};
    //  removeDuplicate(arr);
     String s="race";
     String t="car2";
     System.out.print( isAnagram(s, t));
//    find_Majority(arr1);
    
  }
}
    

