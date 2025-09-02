import java.util.*;
public class HeapSort {
    public static void heapify(int arr[],int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIdx = i;
        if(left<n && arr[left]>arr[maxIdx]){
            maxIdx =left;
        }
         if(right<n && arr[right]>arr[maxIdx]){
            maxIdx =right;
        }

        if(maxIdx!=i){
            int temp = arr[maxIdx];
            arr[maxIdx]=arr[i];
            arr[i]=temp;

            heapify(arr, maxIdx, n);
        }
    }
    public static void heapSrt(int []arr){
        int n=arr.length;
        //conver max-heap
         for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
         }
         // swap first to last

         for(int i=n-1;i>0;i--){
            int temp =arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
         }
    }
    static class Point implements Comparable<Point>{
        int x ,y, dist,idx;
        Point(int x,int y,int dist,int idx){
            this.x=x;
            this.y = y;
            this.dist = dist;
            this.idx =idx;
        }
        @Override
        public int compareTo(Point p2){
            return this.dist - p2.dist;
        }
    }
    public static void main(String[] args){
        // int []arr ={1,2,3,4,5};
        // heapSrt(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println( );


        int points[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Point> pq =new PriorityQueue<>();
        for(int i=0;i<points.length;i++){
            int dists = points[i][0]*points[i][0] - points[i][1]*points[i][1];
            Point obj = new Point(points[i][0], points[i][1],dists,i);
            pq.add(obj);
        }
        for(int i=0;i<k;i++){
            System.out.println( "car is "+ pq.remove().idx+1);
        }

    }
    
}
