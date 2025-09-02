 
 class Spiral {
    public static int printsprl(int matrix[][]){
        int startrow =0;
        int endrow = matrix.length-1;
        int startcol =0;
        int endcol=matrix[0].length-1;
        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int j = startcol; j<=endcol;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            // Right
            for(int i = startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
              }
             //buttom
            for(int j=endcol-1;j>=startcol;j--){
                if(startcol == endcol)
                break;
                System.out.print(matrix[endrow][j]+" ");
                }
            //Left
            for(int i = endrow-1 ;i>=startrow+1;i--){
                if(startrow == endrow)
                break;
                System.out.print(matrix[i][startcol]+" ");
            }
             startrow++;
             endrow--;
             startcol++;
             endcol--;

        }
        return 0;
        

    }
     public static void main(String[] args) {
        int matrix[][] = {{1,2,3},
                          {5,6,7},
                          {9,10,11},
                          {13,14,15}};
         printsprl(matrix);
     }
    }