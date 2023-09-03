// Day40_Q1.java
// LargestString_109
public class LargestString_109 {
    public static void main(String[]args){
        // str1.compareTO(str2) function to comapre 2 strings
        // if equal return 0      if str1 is greater return +ve        if str2 is greater return -ve
        // str1.compareToIgnoreCase(str2)  function is used to compare to strings ignoring the casing
        // sr1.equals(str2) return true or false base on whether  strings are equal or not

        String fruits[]={"mango","apple","banana","pineapple"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest =fruits[i];
            }
        }
        System.out.println(largest);
        
        String fruits1[]={"Mango","Apple","banana","Guava"};
        String largest1 = fruits1[0];
        for(int i=0;i<fruits1.length;i++){
            if(largest1.compareToIgnoreCase(fruits1[i])<0){
                largest1 =fruits1[i];
            }
        }
        System.out.println(largest1);
        System.out.println(largest.equals(largest1));
    }
}
