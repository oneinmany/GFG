/*
Anagram Strings
Difficulty: BasicAccuracy: 49.66%Submissions: 14K+Points: 1
Given two strings S1 and S2 . Return "1" if both strings are anagrams otherwise return "0" .

Note: An anagram of a string is another string with exactly the same quantity of each character in it, in any order.

Example 1:

Input: S1 = "cdbkdub" , S2 = "dsbkcsdn"
Output: 0 
Explanation: Length of S1 is not same
as length of S2.
Example 2:

Input: S1 = "geeks" , S2 = "skgee"
Output: 1
Explanation: S1 has the same quantity 
of each character in it as S2.

Your Task:  
You don't need to read input or print anything. Your task is to complete the function areAnagram() which takes S1 and S2 as input and returns "1" if both strings are anagrams otherwise returns "0".

Expected Time Complexity: O(n)
Expected Auxiliary Space: O(K) ,Where K= Contstant

Constraints:
1 <= |S1| <= 1000
1 <= |S2| <= 1000 
*/
class Solution {
    static int areAnagram(String S1, String S2) {
        // Check if lengths are different
        if (S1.length() != S2.length()) return 0;

        // Convert strings to character arrays
        char[] c1 = S1.toCharArray();
        char[] c2 = S2.toCharArray();

        // Sort both arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        // Compare sorted arrays using Arrays.equals()
        return Arrays.equals(c1, c2) ? 1 : 0;
    }
}
