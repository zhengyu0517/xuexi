package test.sf;

import java.util.logging.Level;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
//        int price = 0;
//        for(int i = 0;i< prices.length-1;i++){
//            for(int j =i+1;j<prices.length;j++){
//                if(prices[j]-prices[i]<=0){
//                    break;
//                }else{
//                    price = Math.max(price,prices[j]-prices[i]);
//                }
//            }
//        }
//        return price;
//[7,1,5,3,6,4]
        //[3,2,6,5,0,3]
        int price = 0;
        int sum = 0;
        int max = 0;
        for(int i = 0;i< prices.length-1;i++){
            int maxPrice = 0;
            for(int j =i+1;j<prices.length;j++){
                if(prices[j]-prices[i]<=0){
                    break;
                }else{
                    price = prices[j]-prices[i];
                    if(price>maxPrice){
                        maxPrice = price;
                        max = j;
                    }else{
                        break;
                    }
                }
            }
            if(max > 0){
                i = max;
                max = 0;
            }
            sum = sum + maxPrice;
        }
        return sum;
    }

    public static void main(String[] args){
        int[] prices = {3,2,6,5,0,3};
        int sum = maxProfit(prices);
        System.out.println(sum);
    }

}
