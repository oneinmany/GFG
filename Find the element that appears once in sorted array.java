/*
Find the element that appears once in sorted array
Difficulty: EasyAccuracy: 55.54%Submissions: 95K+Points: 2
Given a sorted array arr[] of size N. Find the element that appears only once in the array. All other elements appear exactly twice. 

Example 1:

Input:
N = 11
arr[] = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65}
Output: 4
Explanation: 4 is the only element that 
appears exactly once.
 

Your Task:  
You don't need to read input or print anything. Complete the function findOnce() which takes sorted array and its size as its input parameter and returns the element that appears only once. 


Expected Time Complexity: O(log N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= N <= 105
-105 <= arr[i] <= 105
*/
class Solution 
{
    int findOnce(int arr[], int n)
    {
        // Complete this function
        int low =0;
        int high = n-1;
        while(low<high){
            int mid = low +(high -low)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    low = mid+2;
                }
                else{
                    high = mid;
                }
            }
            else{
                if(arr[mid]==arr[mid-1]){
                    low = mid+1;
                }
                else{
                    high = mid;
                }
            }
        }
        return arr[low];
        
    }
}
