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
