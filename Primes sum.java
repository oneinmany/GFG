/*Primes sum
Difficulty: EasyAccuracy: 29.18%Submissions: 45K+Points: 2
Given a number N. Find if it can be expressed as sum of two prime numbers.

Example 1:

Input: N = 34
Output: "Yes" 
Explanation: 34 can be expressed as 
sum of two prime numbers.
Example 2:

Input: N = 23
Output: "No"
Explanation: 23 cannnot be expressed as
sum of two prime numbers. 

Your Task:  
You dont need to read input or print anything. Complete the function isSumOfTwo() which takes N as input parameter and returns "Yes" if can be expressed as sum of two prime numbers. else return "No".

Expected Time Complexity: O(N*sqrt(N))
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 105
  */
class Solution {
    // Function to check if a number N can be expressed as the sum of two prime numbers
    static String isSumOfTwo(int N) {
        // If N is less than or equal to 2, it's impossible to express as the sum of two primes
        if (N <= 2) return "No";
        
        // Loop through all numbers from 2 to N/2
        for (int i = 2; i <= N / 2; i++) {
            // Check if both i and (N - i) are prime
            if (isPrime(i) && isPrime(N - i)) {
                return "Yes";  // If such a pair is found, return "Yes"
            }
        }
        return "No";  // If no pair is found, return "No"
    }

    // Helper function to check if a number is prime
    static boolean isPrime(int nu) {
        if (nu < 2) return false;  // Numbers less than 2 are not prime
        if (nu == 2 || nu == 3) return true;  // 2 and 3 are prime numbers
        if (nu % 2 == 0 || nu % 3 == 0) return false;  // Exclude multiples of 2 and 3
        
        // Check divisibility for numbers of the form 6k ± 1
        for (int i = 5; i * i <= nu; i += 6) {
            if (nu % i == 0 || nu % (i + 2) == 0) {
                return false;
            }
        }
        return true;  // If no divisors found, nu is prime
    }
}
