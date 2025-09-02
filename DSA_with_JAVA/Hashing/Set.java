import java.util.*;
public class Set {
    public static void main(String args[]){
        // HashSet<String> set = new HashSet<>();
        // set.add("vinay");
        // set.add("sachin");
        // set.add("prince");
        // set.add("mithlesh");
        // set.add(null);

        // System.out.println(set);
        // System.out.println(set.contains(1));
        // set.remove(2) ;
        // System.out.println(set);
        // System.out.print(set.isEmpty());  
        // System.out.println(set.size());
      
        //Linked Hash Set  
        // LinkedHashSet<String> ls =new LinkedHashSet <>();
        // ls.add("vinay");
        // ls.add("sachin");
        // ls.add("prince");
        // ls.add("mithlesh");
        // ls.add(null);

        // System.out.println(ls);
        // System.out.println(ls.contains("sachin"));
        // System.out.println(ls.remove("prince"));
        // System.out.println(ls);
        // ls.clear();
        // System.out.println(ls);

        // TreeSet
        TreeSet <Integer> ts=new TreeSet<>();
        // ts.add("vinay");
        // ts.add("sachin");
        // ts.add("prince");
        // ts.add("mithlesh");
        //  System.out.println(ts);


         int nums[]={4,3,2,5,6,7,3,4,2,5,1};
         for(Integer i:nums){
          ts.add(i);
         }
         System.out.println(ts);
         System.out.println(ts.size());
        // Iterator i=set.iterator();
        // while(i.hasNext()){
        //     System.out.print(" "+i.next());
        // }

        // for(Integer idx: set){
        //     System.out.println(idx);
        // }
            

    } 
}
