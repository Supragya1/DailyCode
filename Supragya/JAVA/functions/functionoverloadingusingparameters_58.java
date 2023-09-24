// Day60_Q2.java
// functionoverloadingusingparameters_58.java
// function overloading is using 2 or more functions with same name but there must be difference
// in parameters either in datatype or in their number. 
public class functionoverloadingusingparameters_58 { 

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[]args){
        System.out.println(sum(2,3));
        System.out.println(sum(2,4,3));
    }
}
