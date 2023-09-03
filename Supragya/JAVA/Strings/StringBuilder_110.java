// Day40_Q2.java
// StringBuilder_110
// String Builders are another data structures unlike strings they are not immutable and can be modified
// advantage doesnt make new string in memory everytime some small change is done
// where as evertime some change is done in string new sring is made in memory.
public class StringBuilder_110 {
    public static void main(String[] args) {
       StringBuilder str = new StringBuilder("hello");
       System.out.println(str);
        StringBuilder str1 = new StringBuilder("");
       for(char i ='a';i<='z';i++){
         str1.append(i); //   str.append(i) to add at last of stringbuilder
       }
       System.out.println(str1);
    }  
}
