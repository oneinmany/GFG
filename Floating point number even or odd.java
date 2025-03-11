/*
Floating point number even or odd
Difficulty: BasicAccuracy: 31.6%Submissions: 8K+Points: 1
Given a floating point number in string format s, check whether it is even or odd.
 

Example 1:

Input: 
n = 4
s = 97.8
Output: EVEN
Explanation: 8 is even number.

Example 2:

Input:
n = 6
s = 100.70
Output: ODD
Explanation: Trailing 0s after dot do not matter.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function isEven() which accepts a string s(floating point number) and the integer n(denotes the length of the string s) as input parameter and returns a boolean value.

 
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
 

Constraints:
1 <= n <= 105

n is the length of the string s. 
*/
class Solution 
{ 
    boolean isEven(String s, int n) 
    { 
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == '.') {
                continue;
            }
            if (s.charAt(i) != '0') {
                return (s.charAt(i) - '0') % 2 == 0;
            }
        }
        return false;
    }
}
