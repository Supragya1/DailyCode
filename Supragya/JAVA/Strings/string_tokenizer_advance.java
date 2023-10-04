// Write a java program in which you input name,sapid,cgpa;name,sapid,cgpa;name,sapid,cgpa; as string .Calculate average cgpa
import java.util.*;
public class string_tokenizer_advance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name,sapid,cgpa;");
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s,",;");
        float avg_cgpa=0;
        int count=0;
        int i=1;
        while(st.hasMoreTokens()){
            String s1 = st.nextToken();
            if(i%3==0){
            avg_cgpa += Float.parseFloat(s1);
            count++;
            }
            i++;
        }
        System.out.println("Average cgpa is "+(avg_cgpa/count));
    }
}