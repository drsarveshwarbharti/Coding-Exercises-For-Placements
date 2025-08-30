//Given an integer array nums, find the subarray with the largest sum, and return its sum.

/* 
Example 1:
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

Example 2:
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

Example 3:
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:
1 <= nums.length <= 105
-104 <= nums[i] <= 104
*/

class LargestSumSubarray {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];   // Initialize with first element
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
         
         //=====This is the easy understandable logic=====
         /*
         //CurrentSum
         if(nums[i] > currentSum + nums[i]){
                currentSum = nums[i];
         }else{
                currentSum = currentSum + nums[i];
         }
         //maxSum
         if(currentSum > maxSum){
                maxSum = currentSum;
         }
         */
         //============================================
        }
        return maxSum;
    }
public static void main(String[] args) {
        //Test Case-1
        // int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
        //System.out.println("Output: " + maxSubArray(nums1));  // 6

        //Test Case-2
        //int[] nums2 = {1};
        //System.out.println("Output: " + maxSubArray(nums2));  // 1

        //Test Case-3
        int[] nums3 = {5,4,-1,7,8};
        System.out.println("Output: " + maxSubArray(nums3));  // 23
    }

}
