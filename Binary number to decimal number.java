/*
Binary number to decimal number
Difficulty: BasicAccuracy: 51.5%Submissions: 64K+Points: 1
Given a Binary Number B, find its decimal equivalent.

Example 1:

Input: B = 10001000
Output: 136
Example 2:

Input: B = 101100
Output: 44
Your Task:
You don't need to read or print anything. Your task is to complete the function binary_to_decimal() which takes the binary number as string input parameter and returns its decimal equivalent. 

Constraints:
1 <= number of bits in binary number  <= 16
*/
class Solution {
    static int binary_to_decimal(String B) {
        long n = Long.parseLong(B);
        int ans =0;
        int i=0;
        while(n!=0){
            long digit = n%10;
            ans = (int)(digit*Math.pow(2,i))+ans;
            n = n/10;
            i++;
        }
        return ans;
    }
}
