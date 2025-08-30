//Longest Increasing Subsequence (LIS)
/*Problem Statement: To find the length of the longest increasing subsequence given an integer array. 
The subsequence does not have to be contiguous itself, but its elements should account for an increasing order. */

/*In this way, we will use Dynamic Programming to solve the problem. 
The idea is to create a DP table where each entry dp[i] denotes the longest increasing subsequence that ends at index i. 
We will check, for each element of the array, whether it is extending any of those sequences that end before it by comparing it to the previous elements. */

/* The dp array will store the length of the longest increasing subsequence that ends at every index. 
The nested loops compare each element with the previous elements and thus update the dp array accordingly. 
The result will be the maximum element in the dp array obtained, which will be the LIS length. */

/* Explanation of the Logic
dp[i] = length of the LIS ending at index i.
For each i, check all previous indices j < i.
If nums[i] > nums[j], then nums[i] can extend the LIS ending at j.
Update dp[i] = max(dp[i], dp[j] + 1).
Keep track of the global maximum (maxLen). */

/*Example Walkthrough
For nums = [10,9,2,5,3,7,101,18]
LIS is [2,3,7,101] → length = 4.
DP array evolves like:
dp = [1,1,1,2,2,3,4,4] */

//This is the O(n²) solution.
//The optimized O(n log n) LIS solution using Binary Search + Greedy is also there */

public class LongestIncreasingSubsequence {

    // Function to find LIS length
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int[] dp = new int[n];
        // Every element is at least an LIS of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        int maxLen = 1;

        // Fill dp[i] for LIS ending at index i
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};

        System.out.println("LIS length for nums1: " + lengthOfLIS(nums1)); // 4
        System.out.println("LIS length for nums2: " + lengthOfLIS(nums2)); // 4
        System.out.println("LIS length for nums3: " + lengthOfLIS(nums3)); // 1
    }
}
