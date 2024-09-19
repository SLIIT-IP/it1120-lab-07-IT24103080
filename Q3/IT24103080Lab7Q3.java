import java.util.Scanner;
public class IT24103080Lab7Q3
{
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         for(int i = 1; i <= 5; i++)
         {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double billamount = input.nextDouble();  
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymentmode = input.next().charAt(0);
            if(paymentmode == 'c' || paymentmode == 'C')
            {
               double discount = billamount * 0.05;
               double paidamount = billamount - discount;
               System.out.println("Discount is : " + discount);
               System.out.println("Amount to be paid: " + paidamount);
            }
            else if(paymentmode == 'o' || paymentmode == 'O')
            {
               System.out.println("No discount applicable");
               System.out.println("Amount to be paid: " + billamount);
            }
            else
            {
               System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
         }
  
     }
}