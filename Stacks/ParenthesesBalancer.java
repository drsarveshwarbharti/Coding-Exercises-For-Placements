//Parenthese Balance Checker
/*The famous problem of parentheses balancing in a string is an implementation of the stack data structure. 
The approach is to push opening parentheses into the stack as they occur but popping them each time a closing parenthesis comes. 
If a closing parenthesis doesn't correspond to the closing of the most recent opening parenthesis, the string is not well-formed.*/

/* For instance, let us consider "(())". 
We will proceed through the string while, on getting the character (, we commit it to the stack. 
When we get a character closing parenthesis ), we check the opening parenthesis on top of the stack. 
Conclusively, on completion of reading the string, if the stack is now empty, it means that there are balanced parentheses. */

/*How it Works:
1. Traverse the string character by character.
2. Push opening brackets (, {, [ onto the stack.
3. On encountering a closing bracket ), }, ]:
4. Pop the stack.
5. Check if it matches the corresponding opening bracket.
6. If mismatch or stack empty when popping → not balanced.
7. After traversal, if the stack is empty → balanced. */

/*Example Runs:
Input: (()) → Balanced 
Input: (() → Not Balanced 
Input: {[()]} → Balanced 
Input: {[(])} → Not Balanced  */

import java.util.Stack;

public class ParenthesesBalancer {
    
    // Method to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            // If opening parenthesis, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing parenthesis, check matching
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false; // Wrong match
                }
            }
        }

        // If stack is empty, all matched
        return stack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        String test1 = "(())";
        String test2 = "(()";
        String test3 = "{[()]}";
        String test4 = "{[(])}";

        System.out.println(test1 + " -> " + isBalanced(test1)); // true
        System.out.println(test2 + " -> " + isBalanced(test2)); // false
        System.out.println(test3 + " -> " + isBalanced(test3)); // true
        System.out.println(test4 + " -> " + isBalanced(test4)); // false
    }
}
