/*
Perfect Numbers
Difficulty: EasyAccuracy: 17.21%Submissions: 182K+Points: 2
Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number. Return 1 if the number is Perfect otherwise return 0.

Example 1:

Input:
N = 6
Output:
1 
Explanation:
Factors of 6 are 1, 2, 3 and 6.
Excluding 6 their sum is 6 which
is equal to N itself. So, it's a
Perfect Number.
Example 2:

Input:
N = 10
Output:
0
Explanation:
Factors of 10 are 1, 2, 5 and 10.
Excluding 10 their sum is 8 which
is not equal to N itself. So, it's
not a Perfect Number.
Your Task:
You don't need to read input or print anything. Your task is to complete the function isPerfectNumber() which takes an Integer N as input and returns 1 if N is a Perfect number else returns 0.

Expected Time Complexity: O(sqrt(N))
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 1012
*/
class Solution {
    static int isPerfectNumber(long N) {
        if (N < 2) return 0; // 1 is not a perfect number
        
        long sum = 1; // Start with 1, since it's a proper divisor
        
        // Loop from 2 to sqrt(N)
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) { // If i is a divisor
                sum += i; // Add the divisor i
                
                long otherDivisor = N / i; // Calculate the paired divisor
                if (otherDivisor != i) { // Avoid adding the square root twice
                    sum += otherDivisor; // Add the paired divisor
                }
            }
        }
        
        // Compare sum of proper divisors to N
        return (sum == N) ? 1 : 0; // Return 1 if it's perfect, else 0
    }
}
