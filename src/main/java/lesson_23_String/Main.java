package lesson_23_String;

import java.sql.SQLOutput;

public class Main {
    static void main() {

        boolean result = Solution.isPalindrome(121);
        System.out.println(result);

        int[] nums = {2,2,1,1,1,2,2};
        int majorityElement = Solution.majorityElement(nums);
        System.out.println(majorityElement);

    }


}
