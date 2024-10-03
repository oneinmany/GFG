/*
Min and Max in Array
Difficulty: BasicAccuracy: 68.55%Submissions: 291K+Points: 1
Given an array arr. Your task is to find the minimum and maximum elements in the array.

Note: Return an array that contains two elements the first one will be a minimum element and the second will be a maximum of an array.

Examples:

Input: arr = [3, 2, 1, 56, 10000, 167]
Output: 1 10000
Explanation: minimum and maximum elements of array are 1 and 10000.
Input: arr = [1, 345, 234, 21, 56789]
Output: 1 56789
Explanation: minimum and maximum element of array are 1 and 56789.
Input: arr = [56789]
Output: 56789 56789
Explanation: Since the array contains only one element so both min & max are same.
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)

Constraints:
1 <= arr.size() <= 105
1 <= arr[i] <=1012
*/
class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Handle edge case: null or empty array
        if (arr == null || arr.length == 0) {
            return null; // Or throw an exception if necessary
        }

        long min = arr[0]; // Initialize min as the first element
        long max = arr[0]; // Initialize max as the first element
        int n = arr.length;

        // Traverse the array starting from the second element
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return a Pair<Long, Long> with min and max values
        return new Pair<>(min, max);
    }
}
