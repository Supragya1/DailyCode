// Day66_Q1.java
// Write a program to hide the message in the image using LSB steganography.
import java.util.Scanner;
public class a {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
         System.out.println("Enter the message to be hidden");
            String message = scan.nextLine();
            System.out.println("Enter the image name");
            String image = scan.nextLine();
            System.out.println("Enter the name of the new image");
            String newImage = scan.nextLine();
            System.out.println("Enter the extension of the image");
            String extension = scan.nextLine();
            String command = "python steg.py encode -i " + image + " -o " + newImage + " -f " + message + " -e " + extension;
            try {
                Process process = Runtime.getRuntime().exec(command);
                System.out.println("Message hidden successfully");
            } catch (Exception e) {
                System.out.println(e);
            }
            scan.close();
            
    }
}