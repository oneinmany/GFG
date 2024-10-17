/*
Kadane's Algorithm
Difficulty: MediumAccuracy: 36.28%Submissions: 991K+Points: 4
Given an integer array arr[]. You need to find and return the maximum sum possible from all the subarrays.

Examples:

Input: arr[] = [1, 2, 3, -2, 5]
Output: 9
Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5).
Input: arr[] = [-1, -2, -3, -4]
Output: -1
Explanation: Max subarray sum is -1 of element (-1).
Input: arr[] = [5, 4, 7]
Output: 16
Explanation: Max subarray sum is 16 of elements (5, 4, 7)
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
-107 ≤ arr[i] ≤ 107
*/
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int n = arr.length;
        int sum =0;
        int max =arr[0];
        for(int i=0;i<n;i++){
            sum = sum +arr[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
            sum=0;
            }
    }
    return max;
    
}
}
