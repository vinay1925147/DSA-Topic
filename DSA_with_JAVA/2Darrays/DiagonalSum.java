class DiagonalSum{

     public static int diagosum(int matrix[][]){
        int sum=0 ;
        //  brute force method//////////////////
       /* for(int i = 0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
                if(i==j) {
             sum = sum + matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                sum = sum + matrix[i][j];
             } } }
            return sum; */
        ///optimize method //////////////////////////////////
        for (int i= 0; i<matrix.length;i++){
            //pd
            sum  =sum + matrix[i][i]  ;// i=j
            //sd
            if(i!= matrix.length-i-1) // i!=j
            sum = sum + matrix[i][matrix.length-1-i];
        }
        return sum;
        }
         public static void main(String[] args) {
        int matrix[][] =  {{1,2,3},
                           {5,6,7},
                           {9,10,11}
                           };
                          
       System.out.println( " sum of total diagonals of matrixes :"+ diagosum(matrix));
 }
}