/*
Longest Common Prefix of Strings
Difficulty: EasyAccuracy: 29.52%Submissions: 302K+Points: 2Average Time: 15m
Given an array of strings arr[]. Return the longest common prefix among each and every strings present in the array. If there's no prefix common in all the strings, return "".

Examples :

Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
Output: "gee"
Explanation: "gee" is the longest common prefix in all the given strings.
Input: arr[] = ["hello", "world"]
Output: ""
Explanation: There's no common prefix in the given strings.
Constraints:
1 ≤ |arr| ≤ 103
1 ≤ |arr[i]| ≤ 103


*/

// User function Template for Java
class Solution {
    public String longestCommonPrefix(String arr[]) {
        if(arr.length == 0){
            return "";
        }
        Arrays.sort(arr);
        String str1 = arr[0];
        String str2 = arr[arr.length-1];
        int count = 0;
        while(count < str1.length()){
            if(str1.charAt(count) == str2.charAt(count)){
                count++;
            }else{
                break;
            }
        }
        return count == 0 ? "" : str1.substring(0,count); 
    }
}
