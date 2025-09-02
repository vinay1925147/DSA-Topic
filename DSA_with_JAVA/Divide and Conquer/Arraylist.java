import java.util.ArrayList;
class Arraylist {
    public static  void twoDArray(ArrayList<ArrayList<Integer>> mainlist){
         mainlist= new  ArrayList<>();
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);list.add(2);list.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);list2.add(5);list2.add(6) ;

        ArrayList<Integer> list3 =new ArrayList<>();
        list3.add(7);list3.add(8);list3.add(9);

        mainlist.add(list);mainlist.add(list2);mainlist.add(list3);  
        System.out.println(mainlist);
       int sum=0;
     /// eachh element to get from arraylist
       for(int i=0;i<mainlist.size();i++){
        ArrayList<Integer> curr = mainlist.get(i);
        for(int j=0;j<curr.size();j++){
            sum+=curr.get(j);///sum of all elements
            System.out.print(curr.get(j)+" ");///prints the all elements
         }
         
         System.out.println();
       }
       System.out.println(sum);
    }
    public static boolean printpair(ArrayList<Integer> list ,int target){
        // int j,i;
        // for( i=0;i<list.size();i++){
        //     for(j=i+1;j<list.size();j++){
        //         // System.out.println(list.get(i)+","+list.get(j));
        //         if(list.get(i)+list.get(j)==target)
        //              return true;
        //             } }
        // return false;
        //////////// 2 sum method
        int sum =0;
        int first=0,last=list.size()-1;
        while(first<last){
            sum = list.get(first)+list.get(last);
            if(sum==target)
                return true;
            else if (sum<target)
                first++;
                else
                last--;
             }
        return false;

    }
    public  static int  secondlargest(ArrayList<Integer> list){
        int largest=-1;
        int slargest=-1;
        for(int i=0;i<list.size();i++){
           if(list.get(i)>largest){
             largest=list.get(i);
           }
        }
     // System.out.println(largest);//5
        
        for(int j=list.size()-1;j>=0;j++){
           if(slargest<list.get(j) && slargest<largest){
               slargest=list.get(j);
           }
        }
        return slargest;
     }
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i);
        }
        // System.out.println(list);
    //    System.out.println( printpair(list,10));
        // twoDArray(mainlist);
        
    }
}
     