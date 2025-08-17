//Longest Increasing Subsequence (LIS)
/*Problem Statement: To find the length of the longest increasing subsequence given an integer array. 
The subsequence does not have to be contiguous itself, but its elements should account for an increasing order. */

/*In this way, we will use Dynamic Programming to solve the problem. 
The idea is to create a DP table where each entry dp[i] denotes the longest increasing subsequence that ends at index i. 
We will check, for each element of the array, whether it is extending any of those sequences that end before it by comparing it to the previous elements. */

/* The dp array will store the length of the longest increasing subsequence that ends at every index. 
The nested loops compare each element with the previous elements and thus update the dp array accordingly. 
The result will be the maximum element in the dp array obtained, which will be the LIS length. */

#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int longest_increasing_subsequence(vector<int>& arr) {
    if (arr.empty()) return 0;

    vector<int> dp(arr.size(), 1);

    for (int i = 1; i < arr.size(); ++i) {
        for (int j = 0; j < i; ++j) {
            if (arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j] + 1);
            }
        }
    }

    return *max_element(dp.begin(), dp.end());
}

int main() {
    vector<int> arr = {10, 22, 9, 33, 21, 50, 41, 60, 80};
    cout << "Length of Longest Increasing Subsequence: " << longest_increasing_subsequence(arr) << endl;
    return 0;
}

/*Output
Length of Longest Increasing Subsequence: 6 */

