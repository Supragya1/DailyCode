import java.io.*;
class AccountException extends Exception{
    public AccountException(Exception cause){
        super(cause);
    }
}
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
    public void withdraw(float value) throws AccountException{
        if(value>balance){
            // var fundException= new InsufficientBalaceException();
            // var accException = new AccountException();
            // accException.initCause(fundException);
            // throw accException;
            throw new AccountException(new InsufficientBalaceException());
        }
    }
}
public class ExceptionChaining {
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
        catch(AccountException e){
            System.out.println(e.getMessage());
        }
        try{
        ac.withdraw(80);
        }
        catch(AccountException e){
            System.out.println("Insufficient Balance");
            System.out.println(e.getCause().getMessage());
        }
    }
}
