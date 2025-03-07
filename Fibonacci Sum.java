/*
Fibonacci Sum
Difficulty: MediumAccuracy: 26.82%Submissions: 27K+Points: 4
Given a number positive number N, find the value of f0 + f1 + f2 +... + fN where fi indicates ith Fibonacci number.
Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
Since the answer can be very large, the answer takes modulo with 1000000007 and returned.

Example 1:

Input:
N = 3
Output:
4
Explanation:
0 + 1 + 1 + 2  = 4
Example 2:

Input :
N = 4
Output :
7
Explanation :
0 + 1 + 1 + 2 + 3 = 7

Your Task:
You don't need to read input or print anything. Your task is to complete the function fibSum() which takes an integer N as input parameter and returns the sum of all the Fibonacci numbers from F0 to FN.

Expected Time Complexity: O(Log N)
Expected Space Complexity: O(1)
 

Constraints:
1 <= N <= 100000

Fibonacci Sum
Difficulty: MediumAccuracy: 26.82%Submissions: 27K+Points: 4
Given a number positive number N, find the value of f0 + f1 + f2 +... + fN where fi indicates ith Fibonacci number.
Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
Since the answer can be very large, the answer takes modulo with 1000000007 and returned.

Example 1:

Input:
N = 3
Output:
4
Explanation:
0 + 1 + 1 + 2  = 4
Example 2:

Input :
N = 4
Output :
7
Explanation :
0 + 1 + 1 + 2 + 3 = 7

Your Task:
You don't need to read input or print anything. Your task is to complete the function fibSum() which takes an integer N as input parameter and returns the sum of all the Fibonacci numbers from F0 to FN.

Expected Time Complexity: O(Log N)
Expected Space Complexity: O(1)
 

Constraints:
1 <= N <= 100000

Fibonacci Sum
Difficulty: MediumAccuracy: 26.82%Submissions: 27K+Points: 4
Given a number positive number N, find the value of f0 + f1 + f2 +... + fN where fi indicates ith Fibonacci number.
Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
Since the answer can be very large, the answer takes modulo with 1000000007 and returned.

Example 1:

Input:
N = 3
Output:
4
Explanation:
0 + 1 + 1 + 2  = 4
Example 2:

Input :
N = 4
Output :
7
Explanation :
0 + 1 + 1 + 2 + 3 = 7

Your Task:
You don't need to read input or print anything. Your task is to complete the function fibSum() which takes an integer N as input parameter and returns the sum of all the Fibonacci numbers from F0 to FN.

Expected Time Complexity: O(Log N)
Expected Space Complexity: O(1)
 

Constraints:
1 <= N <= 100000
*/
class Solution {
    static long fibSum(long N) {
        long a = 0, b = 1, t;
        int mod = 1000000007;
        long sum = 0;
        while (N-- > 0){
            sum = (sum+b) % mod;
            //System.out.println(sum);
            t = (a + b) % mod;
            a = b;
            b = t;
        }
        return sum;
    }
   
}
