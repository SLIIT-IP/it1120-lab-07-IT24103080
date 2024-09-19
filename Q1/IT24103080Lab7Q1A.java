import java.util.Scanner;
public class IT24103080Lab7Q1A
{
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter marks for four subjects: ");
         System.out.print("Enter Subject Mark 1: ");
         double mark1 = input.nextDouble();
         System.out.print("Enter Subject Mark 2: ");
         double mark2 = input.nextDouble();
         System.out.print("Enter Subject Mark 3: ");
         double mark3 = input.nextDouble();
         System.out.print("Enter Subject Mark 4: ");
         double mark4 = input.nextDouble();
         double avg = (mark1 + mark2 + mark3 + mark4)/4;
         if (avg<50)
          {
             System.out.println("Average is : "+avg);
             System.out.println("Overall Grade is : Fail");
          }
         else if (avg>49 && avg<75)
          {
             System.out.println("Average is : "+avg);
             System.out.println("Overall Grade is : Credit");
          }
         else
          {
             System.out.println("Average is : "+avg);
             System.out.println("Overall Grade is : Distinction");
          }
     }
}