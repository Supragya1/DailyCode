/*Code Question 1
Amazon is developing an efficient string matching library. Develop a prototype service that matches a simple pattern with a text.
There are two arrays of strings, text, and pat, each of size n. Each string in pat is a regex expression that contains exactly 
one wildcard character (*).
A wildcard character (*) matches any sequence of zero or more lowercase English letters. A regex matches some string if 
it is possible to replace the wildcard character with some sequence of characters such that the regex expression becomes 
equal to the string. No other character can be changed. For example, regex "abc*bcd" matches "abcbcd", "abcefgbcd" and
 "abccbcd" whereas it does not match the strings "abcbd", "abzbcd", "abcd".
For every i from 1 ton, your task is to find out whether pat[i]matches text[i]. Return the answer as an array of strings 
of size n where the string is "YES" if pat[i] matches text[i], and "NO" otherwise.
Note: The implementation shall not use any in build regex libraries.
Example
Given n = 2, text=["code", "coder"], pat = co*d", "co*er"],

text[0]="code", pat[0]= "co*d", "NO", the suffixes do not match text[1]= "coder", par(1)= "co*er", "YES", the prefixes 
and suffixes match
Example

Given n=2, text = ["code", "coder"], pat = ["co*d", `co^{*}er^{\prime\prime}]

• text[0]="code", pat[0] = "co*d", "NO", the suffixes do not match

text[1]= "coder, "pat[1] = "co*er", "YES" the prefixes and suffixes match

Here prefix of a string is defined as any substring that starts at the beginning of the string and suffix of a string is defined as any substring that ends at the end of the string.

Return [^{\prime\prime}NO" "YES"]

Function Description

Complete the function matchStrings in the editor below.

matchStrings has the following parameters:

string text[n]: the strings to test

string pat[n]: the patterns to match

Returns

string[n]: "YES" or "NO" answers to the queries

The first line contains an integer, n, the number of elements in text. Each line / of the n subsequent lines (where Osi<n) contains a string, texti The next line contains the same integer, n, the number of elements in pat Then, each line / of the subsequent lines (where) contains asarning, part

Sample Input For Custom Testing

STDIN

2

FUNCTION

text[] size n = 2

hackerrank

text = ["hackerrank", "hackerrnak"]

hackerrnak

2

pat[] size n = 2

hac rank

pat = ["hac*rank", "hac*rank"]

←

←

hac rank

Sample Output

YES

NO

Explanation

The prefixes and suffixes must match. The suffix in text[1] is "rnak" */
import java.util.*;
public class test {
    public static List<String> matchStrings(String[] text, String[] pat) {
        List <String> ans = new ArrayList<>();
        for (int i = 0; i < text.length; i++) {
            String s = text[i];
            String p = pat[i];
            int star = p.indexOf('*');
            if(s.substring(0,star).equals(p.substring(0,star)) && s.substring(s.length()-star).equals(p.substring(p.length()-star))){
                ans.add("YES");
            }
            else{
                ans.add("NO");
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
        int n = scan.nextInt();
        String[] text = new String[n];
        String[] pat = new String[n];
        System.out.println("Enter the text strings: ");
        for (int i = 0; i < n; i++) {
            text[i] = scan.next();
        }
        System.out.println("Enter the pattern strings: ");
        for (int i = 0; i < n; i++) {
            pat[i] = scan.next();
        }
        List<String> ans = new ArrayList<>();
        ans = matchStrings(text, pat);
        System.out.println(ans);
    }   
}
