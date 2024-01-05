// Day117_Q1.java
import java.util.*;
public class Access_Modifiers_126 {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    BankAccount myAcc = new BankAccount();
    myAcc.username ="Supragya";
    //myAcc.password="supro";    not possible because password has private Access Modifier
    myAcc.SetPass("supro");// is possible becase func is in class itself and password is chnaging there 
    // and that function is public but if it had been private we couldnt have setted the password
    System.out.println(myAcc.username);
    //System.out.println(myAcc.password);
    // here password is not accessable because password is private
 }    
}
// class is a blue print or template
class BankAccount{ // Access Modifiers are of 4 type private,default,protected,public
   public String username;
   private String password;
   public void SetPass(String newPass){
    password=newPass;
   }
}

