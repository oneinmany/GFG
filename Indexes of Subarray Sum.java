/*
Indexes of Subarray Sum
Difficulty: MediumAccuracy: 16.5%Submissions: 1.7MPoints: 4
Given an unsorted array arr containing only non-negative integers, your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value s. You need to return the 1-based indices of the leftmost and rightmost elements of this subarray.

Examples:

Input: arr[] = [1,2,3,7,5], s = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.
Input: arr[] = [1,2,3,4,5,6,7,8,9,10], s = 15,
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.
Input: arr[] = [7,2,1], s = 2
Output: [2, 2]
Explanation: The sum of elements from 2nd to 2nd position is 2.
Input: arr[] = [5,3,4], s = 2
Output: -1
Explanation: There is no subarray with sum 2.
Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 103
0 <= s <= 109
*/
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int s) {
        // code here
        int len = arr.length;
        int left =0;
        int sum =0;
        int [] res =new int[2];
        res[0]=left;
        res[1] =i;
        int [] a= new int[1];
        a[0] =-1;
        for(int i=0; i<=n;i++ ){
            sum+= arr[i];
            while(sum >s && left<=i){
                sum -=arr[left];
                left+=1;
            }
            if(sum==s){
                return res;
            }
        }
        return a;
    }
}
