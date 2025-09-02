public class MoveEnd {
  public static void moveEnd(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    //   if (arr[i] == 0) {
    //     for (int j = i; j < arr.length - 1; j++) {
    //       int temp = arr[j];
    //       arr[j] = arr[j + 1];
    //       arr[j + 1] = temp;
    //     }
    //   }
    // }

    // for (int i = 0; i < arr.length; i++) {
    //   System.out.print(arr[i] + " ");
    // }
    int n=arr.length;
    int j=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]!=0){
        arr[j]=arr[i];
        j++;
      }
    }
    if(j<n){
      arr[j]=0;
      j++;
    }

    for(int i=0 ;i<n;i++){
      System.out.print(arr[i]+" ");
    }

  }

  public static void main(String args[]) {
    int arr[] = { 0, 1, 2, 4, 5 };
    moveEnd(arr);

  }

}
