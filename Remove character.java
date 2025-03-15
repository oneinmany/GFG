/*
Remove character
Difficulty: BasicAccuracy: 59.6%Submissions: 52K+Points: 1
Given two strings string1 and string2, remove those characters from first string(string1) which are present in second string(string2). Both the strings are different and contain only lowercase characters.
NOTE: Size of  first string is always greater than the size of  second string( |string1| > |string2|).
 

Example 1:

Input:
string1 = "computer"
string2 = "cat"
Output: "ompuer"
Explanation: After removing characters(c, a, t)
from string1 we get "ompuer".
Example 2:

Input:
string1 = "occurrence"
string2 = "car"
Output: "ouene"
Explanation: After removing characters
(c, a, r) from string1 we get "ouene".
 

Your Task:  
You dont need to read input or print anything. Complete the function removeChars() which takes string1 and string2 as input parameter and returns the result string after removing characters from string2  from string1.


Expected Time Complexity:O( |String1| + |String2| )
Expected Auxiliary Space: O(|String1|)


Constraints:
1 <= |String1| , |String2| <= 50
*/
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        for(int i=0;i<string2.length();i++){
            char c1=string2.charAt(i);
            int j=0;
            
            while(j<string1.length()){
                char c2=string1.charAt(j);
                if(c1==c2){
                  string1= string1.replace((c2 + ""),"");
                  
                }
                j++;
            }
        }
        return string1;
    }}
