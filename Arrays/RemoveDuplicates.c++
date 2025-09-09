// Program to remove duplicate occurrences from an array
/* Sometimes an array may contain repeated elements.
To simplify the data, we need to make sure each number
appears only once in the final array. */

/* For example, consider the array {1, 1, 2, 2, 3, 4, 4, 5}.
After removing extra duplicates, the array becomes {1, 2, 3, 4, 5}. */

/* If the user enters the array in an unsorted way,
we first sort the array so that duplicates come together.
Then we compare each element with the previous one and
store it only if it is different. */

/* For example, if the input array is {4, 1, 5, 2, 2, 4, 3, 1},
after sorting it becomes {1, 1, 2, 2, 3, 4, 4, 5}.
Now the final array is {1, 2, 3, 4, 5}. */

#include <iostream>
#include <algorithm> // for sort()
using namespace std;

int main() {
    int n;

    // Ask user for size of array
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    int arr[n];
    cout << "Enter " << n << " elements: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Sort the array first
    sort(arr, arr + n);

    // Array to store unique values
    int uniqueArr[n];  
    int j = 0;         

    // Store the first element
    uniqueArr[j++] = arr[0];

    // Keep only one occurrence of each element
    for (int i = 1; i < n; i++) {
        if (arr[i] != arr[i - 1]) {
            uniqueArr[j++] = arr[i];
        }
    }

    // Print the final array
    cout << "Array after removing duplicates from the array: ";
    for (int i = 0; i < j; i++) {
        cout << uniqueArr[i] << " ";
    }

    return 0;
}

/* Output: 
Enter the number of elements in the array: 5
Enter 5 elements: 1 3 2 1 2
Array after removing duplicates from the array: 1 2 3 */
