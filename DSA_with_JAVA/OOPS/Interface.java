public class Interface {
    public static void main(String args[]){
        Queens q= new Queens();
        q.moves();
        Beer b1 = new Beer();
        b1.meets();
        b1.grass();

    }                          
}                                                                                                   
interface chessplayer{
    void moves() ;
}
class Queens implements chessplayer{
     public void moves(){
        System.out.println("up , down , left , right , diagonal");
    }
}

interface  harniborus{
    void grass();

}
interface carniborus {
    void meets();
}
class  Beer implements harniborus , carniborus{
      Beer(){
        System.out.println("beer is black");
      }
       
      public void grass(){
        System.out.println("grass is eating ");
      }
      public  void meets(){
        System.out.println("meat is eating ");

      }

}


