public class Stairsearching {
    public static void main (String []args){
        int matrix [][] = {{10,20,30,40},
                           {15,25,35,45},
                           {27,29,37,48},
                           {32,33,39,50}
                          };
                        int key = 30;
                       System.out.println( staircase(matrix , key));
 }
    public static boolean staircase(int matrix[][] , int key){
        int row =0;
        int column=matrix[0].length;
        while(row <matrix.length&& column >=0){
            int cellvalue = matrix[row][column];
            if( key == cellvalue){
                  System.out.println("("+row+","+column+")");
                  return true;
        }
        else if(key>cellvalue){
            row++; // Bottom Shift
        }
        else  if(key<cellvalue){
              column--;//Lsft shift
        }
    }
    System.out.println("key is not found :");
      return false ;
    }
}
