import arrays.ArrayProblems;

public class Application {

    public static void main(String[] args) {

//        // Two sum
//        int[] input = {2,7,11,15};
//        int target = 9;
//        int[] output = ArrayProblems.twoSum(input, target);
//        System.out.println("indices of the two numbers such that they add up to target: " +
//                "["  + output[0] + ", " + output[1] + "]");

        // Best Time to Buy and Sell Stock
        int[] prices = {7,1,5,3,6,4}; //{7,6,4,3,1};
        int maxProfit = ArrayProblems.maxProfit(prices);
        System.out.println("Maximum profit : " + maxProfit);



    }
}
