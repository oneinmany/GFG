/*
LCM And GCD
Difficulty: BasicAccuracy: 37.02%Submissions: 161K+Points: 1
Given two integers a and b, write a function lcmAndGcd() to compute their LCM and GCD. The function takes two integers a and b as input and returns a list containing their LCM and GCD.

Example 1:

Input: a = 5 , b = 10
Output: 10 5
Explanation: LCM of 5 and 10 is 10, while their GCD is 5.
Input: a = 14 , b = 8
Output: 56 2
Explanation: LCM of 14 and 8 is 56, while their GCD is 2.
Expected Time Complexity: O(log(min(a, b))
Expected Auxiliary Space: O(1)

Constraints:
1 <= a, b <= 109
*/
class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {
        Long[] result = new Long[2]; // To store LCM and GCD

        Long g = gcd(A, B); // Calculate GCD first
        Long lcm = (A * B) / g; // Then calculate LCM

        result[0] = lcm; // LCM at index 0
        result[1] = g;   // GCD at index 1

        return result; // Return the result array
    }

    // Function to calculate GCD using the Euclidean algorithm
    public static Long gcd(Long A, Long B) {
        while (B != 0) {
            Long temp = B;
            B = A % B; // Calculate the remainder
            A = temp;  // Update A
        }
        return A; // Return the GCD
    }
}
