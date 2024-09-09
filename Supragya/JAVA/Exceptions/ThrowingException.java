import java.io.IOException;

class Account{
    // Throwing an unchecked exception
    public void deposit(float value){
        if(value<=0){
            throw new IllegalArgumentException();
        }
        System.out.println(value);
    }
    // Throwing a checked exception
    public void deposit2(float value) throws IOException{
        if(value<=0){
            throw new IOException();
        }
        System.out.println(value);
    }
}
public class ThrowingException {
   
    public static void main(String[] args) {
        Account ac  = new Account();
        try{
            ac.deposit2(-5);
        }
        catch(IOException e){
            System.out.println("Enter a positive value");
            e.printStackTrace();
        }
        ac.deposit(-3);

    }
}
