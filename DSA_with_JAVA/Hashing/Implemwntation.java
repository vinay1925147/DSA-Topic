import java.util.*;
public class Implemwntation {
    static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key=key;
                this.value=value;
            }
        }
    
        private int n;  //size of linkedlist node
        private int N;  //size of buckets
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")    // error ckecking

        public HashMap(){// constructer of hash class
           this.N =4; 
           this.buckets =new LinkedList[4];
           for(int i=0;i<4;i++){
             this.buckets[i]= new LinkedList<>();
           }
        }
        @SuppressWarnings("unchecked")

        private void rehash(){
            LinkedList<Node> oldBuck[] = buckets;
            buckets= new LinkedList[N*2];
            N=N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }

            for(int i=0;i<oldBuck.length;i++ ){
                LinkedList<Node> ll =oldBuck[i];
                for(int j=0;i<ll.size();j++){
                     Node node = ll.remove();
                     put(node.key, node.value);
                } 
            }
        }
        private int SerachInLL(K key , int bi){
            LinkedList<Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node =ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;

        }
        
        private int hashFunction( K key){
             int hc=key.hashCode();  // return the real no.
             int res=Math.abs(hc);
             return res%N; // find the index 
        }

        public void put( K key,V value){
           int bi= hashFunction(key); //size 4 indx 0 1 2
           int di =SerachInLL(key,bi); // key kis indx per mili
            
           if(di!=-1){
               Node node = buckets[bi].get(di);
               node.value = value;
           }else{
              buckets[bi].add(new Node(key ,value));
              n++;
           }
         double  lambda = (double)n/N;
         if(lambda>2.0){
           rehash();  
         }
        }
        public boolean containsKey(K key){
            int bi= hashFunction(key); //size 4 indx 0 1 2
            int di =SerachInLL(key,bi); // key kis indx per mili
    
            if(di!=-1){
                return true;
            }else
            {
              return false;
            }
        }
        public V get( K key){
            int bi= hashFunction(key); //size 4 indx 0 1 2
            int di =SerachInLL(key,bi); // key kis indx per mili
             
            if(di!=-1){
                Node node = buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }

        public V remove( K key){
            int bi= hashFunction(key); //size 4 indx 0 1 2
            int di =SerachInLL(key,bi); // key kis indx per mili
             
            if(di!=-1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
               return null;
            }  

        } 
        public ArrayList<K> keySet( ){
            ArrayList<K> list=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<Node> ll=buckets[i];
                for(Node node : ll){
                  list.add(node.key);
               }
            }
            return list;

        }
        public boolean isEmpty(){
            return n==0;
        } 

    }
    public static void main(String args[]){
         HashMap<String ,Integer> hm = new  HashMap<>();
         hm.put("India", 140);
         hm.put("china", 150);
         hm.put("Pakishtan", 50);
         hm.put("us", 40);

         ArrayList<String >list=hm.keySet();
         for (String i : list) {
              System.out.print(i+" , ");
         }
        //  System.out.println(hm.get("India"));
        //  System.out.println(hm.remove("India"));;
        //  System.out.println(hm.get("India"));
        //  System.out.println(hm.containsKey("us"));
    }
    
}
