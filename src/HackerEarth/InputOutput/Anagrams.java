package HackerEarth.InputOutput;

/*Given two strings, a and b , that may or may not be of the same length,
determine the minimum number of character deletions required to make a and b anagrams.
Any characters can be deleted from either of the strings.
Input :
test cases,t
two strings a and b, for each test case
Output:
Desired O/p
Constraints :
string lengths<=10000
Note :
Anagram of a word is formed by rearranging the letters of the word.
For e.g. -> For the word RAM - MAR,ARM,AMR,RMA etc. are few anagrams.
*/
public class Anagrams {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            String s1 = s.next();
            String s2 = s.next();
            System.out.println(countDeletion(s1, s2));
            t--;
        }
    }

    public static int countDeletion(String s1, String s2) {
        int[] arr = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(arr[i]);
        }
        return ans;
    }
}
