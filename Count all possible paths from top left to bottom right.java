/*
Count all possible paths from top left to bottom right
Difficulty: EasyAccuracy: 30.82%Submissions: 88K+Points: 2
The task is to count all the possible paths from top left to bottom right of a m X n matrix with the constraints that from each cell you can either move only to right or down.

Examples :

Input: m = 2, n = 2
Output: 2 
Explanation: Two possible ways are RD and DR.  
Input: m = 3, n = 3
Output: 6
Explanation: Six possible ways are RRDD, DDRR, RDDR, DRRD, RDRD, DRDR. 
Constraints:
1 <= m <= 17
1 <= n <=17


*/
class Solution {
    int numberOfPaths(int m, int n) {
        int dp[][] = new int[m][n];

        // Initialize first row and first column with 1s
        for (int i = 0; i < m; i++) dp[i][0] = 1;
        for (int j = 0; j < n; j++) dp[0][j] = 1;

        // Fill DP table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1]; 
    }
}
