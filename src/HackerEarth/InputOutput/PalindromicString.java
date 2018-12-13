package HackerEarth.InputOutput;
import java.util.*;
/*You have been given a String S. You need to find and print whether this string is a palindrome or not.
 If yes, print "YES" (without quotes), else print "NO" (without quotes).
Input Format
The first and only line of input contains the String S. The String shall consist of lowercase English
alphabets only.

Output Format
Print the required answer on a single line.

Note
String S consists of lowercase English Alphabets only.*/

public class PalindromicString {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int flag = 0;

        for (int i = 0, j = name.length() - 1; i < name.length() && j > 0; i++, j--) {
            if (name.charAt(i) == name.charAt(j)) {
                continue;
            } else {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

