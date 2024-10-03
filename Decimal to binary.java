/*
Decimal to binary
Difficulty: BasicAccuracy: 55.75%Submissions: 23K+Points: 1
Given a decimal number N, compute its binary equivalent.

Example 1:

Input: N = 7
Output: 111
 

Example 2:

Input: N = 33
Output: 100001
Your Task:
You don't need to read input. Complete the function toBinary() which takes the decimal number N as the input parameter and prints its binary equivalent.
Note: Print the output in a single line, the next line character is printed by the Driver Code.
*/
class Solution {
    void toBinary(int N) {
        int rem = 0;
        int count = 0;
        int ans = 0;
        
        while (N > 0) {
            rem = N % 2;
            ans = rem * (int)Math.pow(10, count) + ans;
            N = N / 2;
            count++;
        }
        System.out.println(ans);
    }
}
