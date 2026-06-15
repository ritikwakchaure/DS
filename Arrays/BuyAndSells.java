public class BuyAndSells {
    public static int maximumProfit(int prices[]) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int n = prices.length;

        for (int i = 0; i < n; i++) {

            if (prices[i] < min) {
                min = prices[i];
            }

            int profit = prices[i] - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

     public static void main(String[] args) {
        System.out.println(maximumProfit(new int[]{7,1,5,3,6,4})); // 5
        System.out.println(maximumProfit(new int[]{7,6,4,3,1}));   // 0
        System.out.println(maximumProfit(new int[]{1,2,3,4,5}));   // 4
        System.out.println(maximumProfit(new int[]{1}));           // 0
        System.out.println(maximumProfit(new int[]{2,4,1}));       // 2
        System.out.println(maximumProfit(new int[]{3,3,3,3}));     // 0
    }

}
