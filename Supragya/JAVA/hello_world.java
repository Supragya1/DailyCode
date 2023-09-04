// Day1_Q1.java
// Q1 Write a program that prompts the user to enter their name and prints "HELLO, <Name>!".
import java.util.Scanner;
public class Day1_Q1{
  public static void main(String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = scan.next();
    System.out.println("HELLO, " + name + "!");
  }
}
