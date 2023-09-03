// Day39_Q1.java
// StringComparison_107
public class StringComparison_107 {
    public static void main(String[]args){
        String s1 = "Supragya";
        String s2 = "Supragya";
        String s3 = new String("Supragya");
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings area not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings area not equal");
        }

        // string1.equals(String2)  ->true or false
        if(s1.equals(s3)){
             System.out.println("Strings are equal");
        }
        else{
             System.out.println("Strings area not equal");
        }
    }
}
