//Maximum element finding problem.

/* The maximum-finding problem has an effortless appeal. 
It requires the same approach of iterating through the array while maintaining a reference to the largest element that has already been seen. 
It is quite easy to implement with a for loop that compares each element with the current maximum. */

/* Assuming we have an array consisting of [1, 5, 3, 9, 2], we start with the assumption that the first element is the maximum. 
The most recent maximum will be updated each time the current maximum encounters a number larger than itself. */

/* Maximum element finding problem.
The logic is straightforward:
- Assume the first element is the maximum.
- Iterate through the array.
- If a number is larger than the current maximum → update it. */

//The algorithm runs in O(n), where n is the number of elements present in the array.

/* Example Run:
Input: [1, 5, 3, 9, 2]
Start: max = 1
Compare 5 → new max = 5
Compare 3 → still 5
Compare 9 → new max = 9
Compare 2 → still 9
Output: Maximum element is: 9 */

public class MaxElementFinder {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 2};

        // Step 1: Assume first element is maximum
        int max = arr[0];

        // Step 2: Loop through array to find maximum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // Update max if current element is larger
            }
        }

        // Step 3: Print result
        System.out.println("Maximum element is: " + max);
    }
}
