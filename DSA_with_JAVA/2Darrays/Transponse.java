import java.util.Scanner;
class  Transponse{
    public static void main(String []args){
        int matrix[][] =  new int [3][3];
         int  row =  3 , colmn = 3;
        // int matrix[][]= {{1,2,3},{3,4,5}, {5,6,7}};
        Scanner sc =new Scanner (System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<colmn;j++){
                matrix[i][j] = sc.nextInt();   
             }
        }
         System.out.println("  oraginal  array  : ");
            for(int i=0;i<3;i++){
                for(int j=0;j<colmn;j++){
            System.out.print(" "+matrix[i][j]);
        }
        System.out.println(" ");
     }
     int trapors[][] = new int [colmn ][row];
     for(int i=0;i<row;i++){
        for(int j=0;j<colmn;j++){
            int temp;
            temp =trapors[j][i];
           trapors [j][i]= matrix [i][j];
           matrix[i][j] = temp;
         }
    }
    for(int i=0;i<row;i++){
        for(int j=0;j<colmn;j++){
            System.out.print(" "+trapors[i][j]);
        }
        System.out.println(" ");
    }
    
    //  for(int i=0;i<row;i++){
    //     for(int j=0;j<colmn;j++){
    //         trapors[j][i] = matrix[i][j];
    //      }
    // }
    // System.out.println("transpose array :");
    // for(int i=0;i<row;i++){
    //     for(int j=0;j<colmn;j++){
    //          System.out.print(" "+trapors[i][j]);
    //     }
    //     System.out.println(" ");
    // }
}
}


