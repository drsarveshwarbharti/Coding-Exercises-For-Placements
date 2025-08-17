//Check if a Number is Prime
/*To check if the number is prime means to check if it is divisible by any number other than 1 and itself. 
A prime number can be nicely divisible by 1 or itself. 
The algorithm used to check for primality is iterating in the range of 2 to the square root of the number. 
This is because any factor larger than the square root would have already been found as a smaller factor. */

/* For example, to check if 17 is prime, we iterate from 2 to the square root of 17 (approximately 4.12). 
Since no numbers divide 17 evenly, it is prime. On the other hand, 18 is divisible by 2 and 3, so it is not prime. */

/* Since we are only checking for divisibility against numbers up to the square root of n, 
the time complexity is O(√n) which is much better than O(n) and gives time for checking divisibility for any number. */

/*Explanation
Why check up to √n?
If n has a factor greater than √n, then the corresponding smaller factor would already have been found.
Example: 18 → factors are (2, 9) and (3, 6). Both small factors (2, 3) are ≤ √18.

Edge cases:
Numbers ≤ 1 → Not prime.
2 and 3 → Prime.

Efficiency:
Instead of checking all numbers up to n-1, we only check up to √n.
Makes a big difference for large numbers. */

public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        // Handle small cases
        if (n <= 1) return false;
        if (n == 2 || n == 3) return true;

        // Check divisibility up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a divisor, not prime
            }
        }

        return true; // No divisors found, prime
    }

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 18;

        System.out.println(num1 + " is prime? " + isPrime(num1)); // true
        System.out.println(num2 + " is prime? " + isPrime(num2)); // false
    }
}
