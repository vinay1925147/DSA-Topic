import java.util.*;
public class Nextgreater {
    public static void bfMethod1(int arr[] ){
        int temp[]= new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int k=0;
                if(arr[i]<arr[j]){
                   temp[k]=arr[j];
                }
                else{
                    temp[k]= -1;
                }
               k++;
            }
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(" "+temp[i]);
        }
    }
    public static void optimizeMethod(StackClass<Integer> s,int  arr[]){
        int nextG[] =new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextG[i]=-1;
            }
            else{
                nextG[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextG.length;i++){
            System.out.print(" "+nextG[i]);
        }
    }
    public static void main(String args[]){
        int arr[] ={6,8,0,1,3};
        StackClass<Integer> s =new StackClass<>();
        bfMethod1(arr);
        // optimizeMethod(s,arr);

    }
}
