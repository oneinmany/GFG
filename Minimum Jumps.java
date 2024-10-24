/*
Minimum Jumps
Difficulty: MediumAccuracy: 11.91%Submissions: 893K+Points: 4
Given an array arr[] of non-negative integers. Each array element represents the maximum length of the jumps that can be made forward from that element. This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array starting from the first element. If an element is 0, then you cannot move through that element.
Note:  Return -1 if you can't reach the end of the array.

Examples : 

Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
Output: 3 
Explanation:First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last. 
Input: arr = [1, 4, 3, 2, 6, 7]
Output: 2 
Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
Input: arr = [0, 10, 20]
Output: -1
Explanation: We cannot go anywhere from the 1st element.
Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
2 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 105
*/
class Solution {
    static int minJumps(int[] arr) {
        // code here
        int n = arr.length;
        int current =0;
        int farthest =0;
        int jumps =0;
        if(n<=1){// no need of jumps
            return 0;
        }
        if(arr[0]==0){
            return -1;
        }
        for(int i=0;i<n-1;i++){
            farthest = Math.max(farthest, i+arr[i]);
            if(i==current){
                jumps++;
                current =farthest;
            }
            if(current>=n-1){
                return jumps;
            }
            if(i>=farthest){
                return -1;
            }
        }
        return -1;   
    }
}
