package strings;

import java.util.ArrayList;
import java.util.List;

public class StringRecursion {

    //print all subsequences of given string
    static void printSubsequences(String str, int index, String ans, List<String> result) {
        //base case
        if(index == str.length()) {
            result.add(ans);
            return;
        }
        //include the current char
        printSubsequences(str, index + 1, ans + str.charAt(index), result);

        //exclude the current char
        printSubsequences(str, index + 1, ans, result);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        List<String> subsequences = new ArrayList<>();
        printSubsequences(str, 0, ans, subsequences);
        for (String sub : subsequences) {
            System.out.println(sub);
        }
    }
}


