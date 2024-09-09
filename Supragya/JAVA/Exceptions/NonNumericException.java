// Create an exception class that throws an exception if the operand is non-numeric when
// calculating the modulus (using command line arguments).
public class NonNumericException {
    public static void main(String[] args) {
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("The modulus of "+a+" and "+b+" is "+(a%b));
        }
        catch(NumberFormatException e){
            System.out.println("The operand is non-numeric");
        }
    }
}
