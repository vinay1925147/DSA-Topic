import java.util.*;

class PriorityQ {
    static class Row implements Comparable<Row>{
        int idx;
        int solder;
        public Row(int idx,int solder){
            this.idx = idx;
            this.solder = solder;
        }
        @Override
        public int compareTo(Row r2){
            if(this.solder==r2.solder){
                return this.idx-r2.idx;
            }
            else{
                return this.solder - r2.solder;
            }
        }
    }
   static class Student implements Comparable<Student> {
    int rollNo;
    String name;

    public Student( String name ,int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    @Override
    public  int compareTo(Student s2) {
        return this.rollNo - s2.rollNo;
    }
}
    public static void main(String args[]) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
    // //  pq.add(new Student("vinay", 12));
    //   pq.add(new Student("sachin", 10));
    //   pq.add(new Student("prince", 3));
    //   pq.add(new Student("hema", 23));
    //    System.out.print(pq);
    //    System.out.print(pq.poll());
    //    System.out.println(pq);
    //    System.out.println(pq.size());

    int [][]arr ={
        {1,0,0,0},
        {1,1,1,1},
        {1,0,0,0},
        {1,0,0,0}
    };
    int k=2,m=arr.length,n=arr[0].length;
     PriorityQueue<Row> pq = new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<m;i++){
        int count=0;
        for(int j=0;j<n;j++){
            if(arr[i][j]==1){
                count++;
            }
        }
        pq.add(new Row(i,count));
    }
 
//    while (k>0){
//     System.out.println("R"+pq.poll().idx);
//     k--;
//     }
for(int i=0;i<k;i++){
    System.out.println("R"+pq.poll().idx);
}


      

    }
}