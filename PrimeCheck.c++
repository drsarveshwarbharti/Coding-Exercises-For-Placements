//Check if a Number is Prime in C++
/*To check if the number is prime means to check if it is divisible by any number other than 1 and itself. 
A prime number can be nicely divisible by 1 or itself. 
The algorithm used to check for primality is iterating in the range of 2 to the square root of the number. 
This is because any factor larger than the square root would have already been found as a smaller factor. */

/* For example, to check if 17 is prime, we iterate from 2 to the square root of 17 (approximately 4.12). 
Since no numbers divide 17 evenly, it is prime. On the other hand, 18 is divisible by 2 and 3, so it is not prime. */

/* Since we are only checking for divisibility against numbers up to the square root of n, 
the time complexity is O(√n) which is much better than O(n) and gives time for checking divisibility for any number. */

#include <iostream>
#include <cmath>
using namespace std;

bool is_prime(int num) {
    if (num <= 1) return false;
    for (int i = 2; i <= sqrt(num); ++i) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
}

int main() {
    cout << "Is 17 prime? " << (is_prime(17) ? "Yes" : "No") << endl;
    cout << "Is 18 prime? " << (is_prime(18) ? "Yes" : "No") << endl;
    return 0;
}

/*Output:
Is 17 prime? Yes
Is 18 prime? No */
