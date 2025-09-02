import java.util.*;

class TrappingWater {

    public static int BuyandsellStock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int max_price=0;
        for(int i=0 ;i<prices.length;i++){
            if(buyprice<prices[i]){
                int profit = prices[i]-buyprice;
                max_price=Math.max(max_price,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return max_price;

    }
    public static int trappedWater(int[] height) {
         int n = height.length;
        if(n==1 || n==2){
            return 0;
        }
      
        // calculate left_max in Array form
       
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate right_max in Array form

        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int storeWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterlevel -- min(leftmax , rightmax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // area of single bar = waterlevel - height of bar
            storeWater = storeWater + (waterLevel - height[i]);
        }
        return storeWater;

    }

    public static void main(String args[]) {
        int[] height = {12,3,1,4,2,5};
        System.out.print("total water trapped in bars is : "+trappedWater(height));
        int []prices={1,2,3,1};
        System.out.println("maximum profit is : "+BuyandsellStock(prices));

    }
}