import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MultipleCatch {
        public static void multipleCatch(){
        try{
            var file = new FileReader("file.txt");
            var value = (char)file.read();
            System.out.println(value);
            new SimpleDateFormat().parse("");
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ParseException e){
            System.out.println(e.getMessage());
        }
        // catch(IOException | ParseException e){
        //     System.out.println(e.getMessage());
        // }
    }
    public static void main(String[] args) {
        multipleCatch();
    }
}
