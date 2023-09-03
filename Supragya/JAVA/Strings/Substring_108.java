// Day39_Q2.java
// Substring_108
public class Substring_108 {
    public static void main(String[]args){
        String str = "HelloWorld";
        String substr = "";
        int si=0,ei=5;
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
         System.out.println(substr);
         // function is  str.subsring(staringindex,ending index)
         String substr2=str.substring(si,ei);
         System.out.println(substr2);
    }
}
