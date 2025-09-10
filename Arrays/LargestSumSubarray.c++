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

#include <iostream>
#include <algorithm> // for max
using namespace std;

int main() {
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    int nums[n];
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    int currentSum = nums[0];
    int maxSum = nums[0];

    for (int i = 1; i < n; i++) {
        // Either start new subarray or extend previous
        currentSum = max(nums[i], currentSum + nums[i]);
        maxSum = max(maxSum, currentSum);
    }

    cout << "Maximum Subarray Sum = " << maxSum << endl;

    return 0;
}

/*Output:
Enter size of array: 9
Enter 9 elements: -2 1 -3 4 -1 2 1 -5 4
Maximum Subarray Sum = 6 */
