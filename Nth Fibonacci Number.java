/*
Nth Fibonacci Number
Difficulty: EasyAccuracy: 22.3%Submissions: 334K+Points: 2
Given a positive integer n, find the nth fibonacci number. Since the answer can be very large, return the answer modulo 1000000007.

Note: for the reference of this question take first fibonacci number to be 1.

Examples :

Input: n = 2
Output: 1 
Explanation: 1 is the 2nd number of fibonacci series.
Input: n = 5
Output: 5
Explanation: 5 is the 5th number of fibonacci series.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(n)

Constraints:
1<= n <=105
*/
class Solution {
    static int nthFibonacci(int n){
        // code here
        long[] arr = new long[n+1];
        int mod =1000000007;
        arr[1]=1;
        arr[2]=1;
        for(int i =3; i<=n;i++){
            arr[i]=(arr[i-1]+arr[i-2])%mod;
        }
        return (int)arr[n];
    }
}
