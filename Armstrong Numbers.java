/*
Armstrong Numbers
Difficulty: EasyAccuracy: 49.88%Submissions: 156K+Points: 2
You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 371 is an Armstrong number since 33 + 73 + 13 = 371. 

Note: Return "true" if it is an Armstrong number else return "false".

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".
Input: n = 372
Output: false
Explanation: 372 is not an Armstrong number since 33 + 73 + 23 = 378. Hence answer is "false".
Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1) 

Constraints:
100 ≤ n <1000 
*/
class Solution {
    static String armstrongNumber(int n) {
        // code here
        int hund = n/100;
        int tens = (n/10)%10;
        int units = n%10;
        int result = (hund*hund*hund)+(tens*tens*tens)+(units*units*units);
        
        if(n == result){
            return "true";
        }
        else{
            return "false";
        }
    }
}
