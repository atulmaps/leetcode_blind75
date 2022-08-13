import arrays.ArrayProblems;

public class Application {

    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] output = ArrayProblems.twoSum(input, target);
        System.out.println("indices of the two numbers such that they add up to target: " +
                "["  + output[0] + ", " + output[1] + "]");
    }
}
