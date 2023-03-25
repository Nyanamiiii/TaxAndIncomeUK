import java.util.InputMismatchException;
import java.util.Scanner;
class Income
{
    public static void main(String args[])
    {
        double tax=0, it;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter income ");

        try {
            it= sc.nextDouble();
        } catch (InputMismatchException exception ) {
            System.out.println("Decimal number expected!");
            return;
        }
        if(it<=12.570)
            tax=0;
        else if(it>=12.571)
            tax=20;
        else if (it<=50.270)
            tax=20;
        else if (it>=50.271)
            tax=40;
        else if (it<=150.000)
            tax=40;
        else if (it>=150.000)
            tax=45;


        System.out.println("Income tax amount is "+tax);


    }
}

