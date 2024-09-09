// Write a Java program to display the names and roll numbers of 10 students. Initialize
// respective arrays for students. Handle the ArrayIndexOutOfBoundsException to prevent
// illegal termination of the program.
import java.util.*;
public class ArrayOutOfBoundException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names[] = new String[10];
        int rollno[] = new int[8];
        try{
            for(int i=0;i<10;i++){
                System.out.println("Enter the name of student "+(i+1));
                names[i] = scan.nextLine();
                System.out.println("Enter the roll number of student "+(i+1));
                rollno[i] = scan.nextInt();
                scan.nextLine();
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array index is out of Bound");
        }
        try{
            for(int i=0;i<10;i++){
                System.out.println("Names: "+names[i]+" Roll number: "+rollno[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array index is out of Bound");
        }
    }
}
