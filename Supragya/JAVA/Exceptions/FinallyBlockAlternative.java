import java.io.*;

public class FinallyBlockAlternative {
    public static void main(String[] args) {
        try(
            var reader = new FileReader("file.txt");
        ){
            var value = reader.read();
            System.out.println((char)value);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
