package array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/first-missing-positive/
 *
 * @author CPRA
 */
public class FirstMisingNumber {

    public static void main(String[] args) {
        int[] a = new int[1];
        a[0] = -4;
        Integer result = new FirstMisingNumber().firstMissingPositive(a);
        System.out.println(result);
    }

    public int firstMissingPositive(int[] nums) {

        if (nums.length == 0) return 1;

        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                integerSet.add(nums[i]);
            }
        }
        int i  = 1;
        for (i = 1; i <= nums.length; i++) {
            if (!integerSet.contains(i)) {
                return i;
            }
        }
        return i;
    }
}