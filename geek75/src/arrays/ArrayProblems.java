package arrays;

import java.util.HashMap;

public class ArrayProblems {

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
}
