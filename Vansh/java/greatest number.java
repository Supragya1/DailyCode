public class greatestnumber
{
    public static void main (String[] args)
    {
        int a = 20;
        int b = 15;
        int c = 10;
        int x = 0;

        if(a>b)
        {
        x=a;
        }
 
        else if(b>a)
        {
            x=b;
        }

        else if(x>c){
            System.out.print("The Greatest Number is : ");
            System.out.println(x);

        }
        else
        {
            System.out.print("The Greatest Number is : ");
            System.out.println(c);

        }
    }
}
