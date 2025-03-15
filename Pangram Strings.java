/*
Pangram Strings
Difficulty: EasyAccuracy: 49.94%Submissions: 14K+Points: 2
Check if the given string S is a Panagram or not. A pangram is a sentence containing every letter in the English Alphabet.

Example 1:

Input: S = "Pack mY box witH fIve dozen 
            liquor jugs"
Output: 1
Explanation: Given string contains all 
English Alphabets. 
Example 2:

Input: S = "geeksFORgeeks"
Output: 0
Explanation: Given string does not contain 
all English Alphabets. 
Your Task:  
You don't need to read input or print anything. Your task is to complete the function isPanagram() which takes the string as inputs and returns 1 if the given string is panagram, otherwise 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(constant)

Constraints:
1 ≤ |S| ≤ 105
*/
class Solution {
    int isPanagram(String S) 
    {
        S=S.toLowerCase();
        Set<Character>hset=new HashSet<>();
        for(char c:S.toCharArray())
        {
            if(c>='a' && c<='z')
                hset.add(c);
        }
        if(hset.size()==26)
            return 1;
        return 0;
    }
}
