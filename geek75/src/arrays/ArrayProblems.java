package arrays;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;

public class ArrayProblems {

    // Two sum
    /*
    Given an array of integers nums and an integer target,
    return indices of the two numbers such that they add up to target.
    * */

    /*
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    * */

    // T O(N)  ||  S O(N)
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> pairMap = new HashMap<>();

        for(int i=0; i < nums.length; i++) {
            int findOtherElement = Math.abs(nums[i] - target);
            if(pairMap.containsKey(findOtherElement)) {
                return new int[] {pairMap.get(findOtherElement), i};
            }
            else {
                pairMap.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }

    // Best Time to Buy and Sell Stock
    /*
    * You are given an array prices where prices[i] is the price of a given stock on the ith day.
    * You want to maximize your profit by choosing a single day to buy one stock and
    * choosing a different day in the future to sell that stock.
    *
    * Return the maximum profit you can achieve from this transaction.
    * If you cannot achieve any profit, return 0.
    *
    * */

    /*
    Input: prices = [7,1,5,3,6,4]
    Output: 5
    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
    * */

    public static int maxProfit(int[] prices) {

        int minBuyingPrice = prices[0];
        int maxProfit = 0;

        for(int i=1; i < prices.length; i++) {
            int currPrice = prices[i];
            if(currPrice > minBuyingPrice) {
                maxProfit = Math.max(maxProfit, currPrice - minBuyingPrice);
            }
            else {
                minBuyingPrice = currPrice;
                maxProfit = 0;
            }
        }
        return maxProfit;
    }

    // Contains Duplicate
    /*
    Given an integer array nums,
    return true if any value appears at least twice in the array, and
    return false if every element is distinct.
    */

    /*
    Input: nums = [1,2,3,1]
    Output: true
    * */

    public static boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Boolean> countMap = new HashMap();

        for(int i=0; i < nums.length; i++) {
            // check if we visited
            if(countMap.containsKey(nums[i])) {
                return true;
            }
            else {
                countMap.put(nums[i], true);
            }
        }
        return false;
    }

}
