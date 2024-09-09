import java.io.*;
class InsufficientBalaceException extends Exception{
    // checked -> Exception
    // unchecked(runtime) -> RuntimeException
    
    public InsufficientBalaceException(){
        super("Insufficient Balance in your Account");
    }
    public InsufficientBalaceException(String msg){
        super(msg);
    }
}
class Account{
    private float balance;
    public void deposit(float value) throws IOException{
        if(value<=0){
            throw new IOException();
        }
        else{
            balance += value;
        }
    }
    public void withdraw(float value) throws InsufficientBalaceException{
        if(value>balance){
            throw new InsufficientBalaceException();
        }
    }
}
public class CustomException {
    public static void main(String[] args) {
        Account ac = new Account();
        try{
        ac.deposit(60);
        System.out.println("Deposited");
        }catch(IOException e){
            System.out.println("Enter the value in positive as deposit can't be negative its withdrawl");
        }
        try{
        ac.deposit(-10);
        }catch(IOException e){
            System.out.println("Enter the value in positive as deposit can't be negative its withdrawl");
        }
        try{
        ac.withdraw(80);
        }
        catch(InsufficientBalaceException e){
            System.out.println(e.getMessage());
        }
        try{
        ac.withdraw(80);
        }
        catch(InsufficientBalaceException e){
            System.out.println("Insufficient Balance");
        }
    }
}
