/*
Move all zeroes to end of array
Difficulty: EasyAccuracy: 45.51%Submissions: 194K+Points: 2
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

Examples:

Input: arr[] = [3, 5, 0, 0, 4]
Output: [3, 5, 4, 0, 0]
Explanation: The non-zero elements preserve their order while the 0 elements are moved to the right.
Input: arr[] = [0, 0, 0, 4]
Output: [4, 0, 0, 0]
Explanation: 4 is the only non-zero element and it gets moved to the left.
Input: arr[] = [10, 2, 4]
Output: [10, 2, 4]
Explanation: Since there are no 0s, the array does not change.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105
*/
class Solution {
    void pushZerosToEnd(int[] arr) {
        int lastNonZeroFoundAt = 0;  // This keeps track of the last non-zero element

        // Traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the element at 'lastNonZeroFoundAt'
                int temp = arr[i];
                arr[i] = arr[lastNonZeroFoundAt];
                arr[lastNonZeroFoundAt] = temp;
                
                // Increment the lastNonZeroFoundAt index
                lastNonZeroFoundAt++;
            }
        }
    }
}
