//Check if a Number is Palindrome in C++
/* A palindrome is a number, word, or sequence that remains the same when read forward or backward.
In mathematics and programming, a palindrome number is a number that does not change when its digits are reversed.*/

/*For example, to check if 151 is a palindrome, we reverse its digits.
The digits are: 1, 5, 1
Reversing them gives 151 again.
Since the reversed number is the same as the original number, 151 is a palindrome.*/

/*But if we take 152,
The digits are: 1, 5, 2
Reversing them gives 251
Since 251 ≠ 152, it is not a palindrome.*/

#include <iostream>
using namespace std;

int main() {
    int num, original, reversed = 0, digit;
    
    cout << "Enter a number: ";
    cin >> num;

    original = num;  // store the original number

    // reverse the number
    while (num > 0) {
        digit = num % 10;                           // get last digit
        reversed = reversed * 10 + digit;          // build reversed number
        num = num / 10;                           // remove last digit
    }

    // check palindrome
    if (original == reversed)
        cout << "The number is a Palindrome." << endl;
    else
        cout << "The number is NOT a Palindrome." << endl;

    return 0;
}

/*Output:
Enter a number:151
The number is a Palindrome.

Enter a number:120
The number is NOT a Palindrome. */
