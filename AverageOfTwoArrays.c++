//Find the average of two Arrays.
/* The average is the sum of numbers divided by the total count of numbers.
In programming, we can calculate the average of elements in an array by
adding all its elements and then dividing by the number of elements. */

/* For example, consider the array {2, 4, 6, 8}.
The sum of elements = 2 + 4 + 6 + 8 = 20
Number of elements = 4 */

/* Similarly, for the array {1, 3, 5, 7, 9}.
The sum of elements = 1 + 3 + 5 + 7 + 9 = 25
Number of elements = 5 */

/* To find the combined average of both arrays,
we add all elements together: 20 + 25 = 45
Total elements = 4 + 5 = 9
Combined average = 45 / 9 = 5 */


#include <iostream>
using namespace std;

int main() {
    int n1, n2;

    // input size of first array
    cout << "Enter number of elements in first array: ";
    cin >> n1;
    int arr1[n1];
    cout << "Enter elements of first array: ";
    for (int i = 0; i < n1; i++) {
        cin >> arr1[i];
    }

    // input size of second array
    cout << "Enter number of elements in second array: ";
    cin >> n2;
    int arr2[n2];
    cout << "Enter elements of second array: ";
    for (int i = 0; i < n2; i++) {
        cin >> arr2[i];
    }

    // sum of arr1
    int sum1 = 0;
    for (int i = 0; i < n1; i++) {
        sum1 += arr1[i];
    }
    
    // sum of arr2
    int sum2 = 0;
    for (int i = 0; i < n2; i++) {
        sum2 += arr2[i];
    }
    
    // combined average
    double combinedAvg = (double)(sum1 + sum2) / (n1 + n2);
    cout << "Combined average of both arrays = " << combinedAvg << endl;

    return 0;
}
/*Output:
Enter number of elements in first array: 5
Enter elements of first array: 1 2 3 4 5
Enter number of elements in second array: 5
Enter elements of second array: 6 7 8 9 10
Combined average of both arrays = 5.5  */
