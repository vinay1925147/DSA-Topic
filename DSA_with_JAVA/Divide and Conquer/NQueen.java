 class NQueen {
    public static void printarr(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
              System.out.print( board[i][j]+" ");
            }
            System.out.println();
        }
      
    }
   public static boolean isSafe(char[][] board , int row,int col ){
    for(int i=row-1; i>=0;i--){
        if(board[i][col]=='Q'){///vertical
            return false;
        }
    }
    for(int i=row-1 , j=col-1;  i>=0  && j>=0;i-- ,j--){ //left diagonal
        if(board[i][j]=='Q'){
            return false;
        }
    }
    for(int i=row-1,j= col+1 ; i>=0 && j<board.length; i--,j++){ //right diagonal
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
   }
    public static void isQueen(char[][] board ,int row){
        if(row==board.length){
           printarr(board);
           return;
        }
         for(int j=0;j<board.length;j++){
            if(isSafe(board , row ,j)) {  
             board[row][j] = 'Q';
             isQueen(board,row+1);
             board[row][j]='.';
        }
    }
   }
    public static void main(String args[]){
        char[][] board = new char[4][4];
        for(int i=0;i<board.length;i++){
           for(int j=0;j<board[0].length;j++){
                board[i][j]='.';
            }
        }
        isQueen(board , 0);
    }
    }
