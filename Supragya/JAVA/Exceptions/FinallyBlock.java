import java.io.*;

public class FinallyBlock {
    public static void main(String[] args) {
        FileReader reader = null;
        try{
        reader = new FileReader("file1.txt");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
        if (reader != null) {
            try{
            reader.close();
            }
            catch(IOException e){
                System.out.println(e.getMessage());
            }
        }
            System.out.println("It will always execute whether exception occurs or not");
        }
    }
}
