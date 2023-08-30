// Day35_Q2.java
public class logicaloperators_16 {
    public static void main(String[]args){

        System.out.println((3<2) && (2<5));  // for &&  T T = T  ; T F = F ;    F T = F    ;   F F = F
        System.out.println((2>5) || (3>1));  // for ||  T T = T  ; T F = T ;    F T = T    ;   F F = F
        System.out.println(!(3>1));          // LOgical not  it opposites the answer of the statement
    }
}
