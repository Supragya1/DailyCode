// Write a java program in which you have to take a paragraph as an input and then check for every individual word.
// if length of a word is greater than 3 then except 1st and last letter jumble the inbetween letters.
import java.util.*;
public class jumble_words {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a paragraph or a line");
        StringBuffer sb = new StringBuffer(scan.nextLine());
        int n = sb.length();
        StringTokenizer st = new StringTokenizer(sb.toString(), " ");
        while(st.hasMoreTokens()){
            StringBuffer sb2 = new StringBuffer(st.nextToken());
            if(sb2.length() > 3) {
                for(int i=1;i<sb2.length()-1;i++) {
                    int j = (int)(Math.random()*(sb2.length()-2))+1; 
                    char c = sb2.charAt(i);
                    sb2.setCharAt(i, sb2.charAt(j));
                    sb2.setCharAt(j, c);
                }
            }
            System.out.print(sb2+" ");
        }
    }
}
