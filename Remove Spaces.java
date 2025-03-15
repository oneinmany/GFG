/*
Remove Spaces
Difficulty: BasicAccuracy: 49.21%Submissions: 75K+Points: 1
Given a string s. Your task is to remove spaces from it. 

Examples:

Input: s = "geeks  for geeks"
Output: "geeksforgeeks"
Explanation: All the spaces have been removed.
Input: s = "    g f g"
Output: "gfg"
Explanation: All the spaces including the leading ones have been removed.
Constraints:
1<=|s|<=105
*/
class Solution {

    String modify(String s) {
        String str="";
        // your code here
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' '){
                continue;
            }
            else{
                str+=ch;
            }
        }
        return str;
    }
}
