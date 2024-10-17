/*Longest Sub-Array with Sum K
Difficulty: MediumAccuracy: 24.64%Submissions: 452K+Points: 4
Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.

Examples:

Input : n = 6, arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation: The sub-array is {5, 2, 7, 1}.
Input : n= 3, arr[] = {-1, 2, 3}, k = 6
Output : 0
Explanation: There is no such sub-array with sum 6.
Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).

Constraints:
1<=n<=105
-105<=arr[i], K<=105
*/
class Solution {
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int A[], int N, int K) 
    {
        Map<Integer,Integer> mp = new HashMap<>();
        int sum=0,maxLen=0;
        for(int i=0; i<N; i++)
        {
            sum+=A[i];
            
            if(sum==K)
                maxLen = Math.max(maxLen,i+1);
        
            int rem = sum-K;
        
            if(mp.containsKey(rem))
            {
                int len = i - mp.get(rem);
                maxLen = Math.max(maxLen,len);
            }
        
            if(!mp.containsKey(sum))
                mp.put(sum,i);
        }
        return maxLen;
        
    }
}

