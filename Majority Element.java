/*
Majority Element
Difficulty: MediumAccuracy: 27.82%Submissions: 693K+Points: 4Average Time: 59m
Given an array arr. Find the majority element in the array. If no majority exists, return -1.

A majority element in an array is an element that appears strictly more than arr.size()/2 times in the array.

Examples:

Input: arr[] = [3, 1, 3, 3, 2]
Output: 3
Explanation: Since, 3 is present more than n/2 times, so it is the majority element.
Input: arr[] = [7]
Output: 7
Explanation: Since, 7 is single element and present more than n/2 times, so it is the majority element.
Input: arr[] = [2, 13]
Output: -1
Explanation: Since, no element is present more than n/2 times, so there is no majority element.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i]≤ 105
*/
class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int size = arr.length/2;
        if(arr.length==1) return arr[0];
        for(int i=0;i<arr.length-1;i++){
            int count =1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
                if(count>size) return arr[i];
            }
        }
        return -1;
    }
}
