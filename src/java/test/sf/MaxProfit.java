package test.sf;

import java.util.logging.Level;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int price = 0;
        for(int i = 0;i< prices.length-1;i++){
            for(int j =i+1;j<prices.length;j++){
                if(prices[j]-prices[i]<=0){
                    break;
                }else{
                    price = Math.max(price,prices[j]-prices[i]);
                }
            }
        }
        return price;
    }
}
