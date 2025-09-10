//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
/*Example 1:
Input: nums = [3,0,1]
Output: 2
Explanation:
n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2
Explanation:
n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation:
n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.*/

#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter size of array: ";
    cin >> n;

    int nums[n];
    cout << "Enter " << n << " elements (numbers from 0 to n, one missing): ";
    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }

    // Expected sum of numbers from 0 to n
    int actualSum = (n * (n + 1)) / 2;

    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += nums[i];
    }

    int missingNo = actualSum - sum;
    cout << "Missing Number = " << missingNo << endl;
    return 0;
}

/*Output:
Enter size of array: 3
Enter 3 elements (numbers from 0 to n, one missing): 0 3 1
Missing Number = 2 */
