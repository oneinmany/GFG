/*
Second Largest
Difficulty: EasyAccuracy: 26.72%Submissions: 726K+Points: 2
Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.

Examples:

Input: arr = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.
Input: arr = [10, 10]
Output: -1
Explanation: The largest element of the array is 10 and the second largest element does not exist..
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
2 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 105
*/
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = arr[0];
        int smax = -1;
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                smax =max;
                max= arr[i];
            }else if(arr[i]>smax && arr[i]!=max){
                arr[i] =smax;
            }
        }
        return smax;
    }
}
