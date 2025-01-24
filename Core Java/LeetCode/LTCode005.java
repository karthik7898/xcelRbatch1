package LeetCode;
import java.util.Arrays;

public class LTCode005 {         
    public static int[] twoSum(int[] nums, int target) {                 
        for (int i = 0; i < nums.length; i++) {                             
            for (int j = i + 1; j < nums.length; j++) {                                             
                if (nums[i] + nums[j] == target) {                                                                 
                    return new int[] { i, j };                                                                                 
                }                                                  
            }                                                                                                    
        }                                                                                                            
        return new int[0];                                                                                                                  
    }                                                                                                                 

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(twoSum(nums1, target1)));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(twoSum(nums2, target2)));

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(twoSum(nums3, target3)));
    }
}
