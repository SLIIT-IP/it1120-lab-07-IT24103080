import java.util.Scanner;
public class IT24103080Lab7Q1B
{
     public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         for(int i = 1; i <= 3; i++)
         {
            System.out.println("Student " + i);
            System.out.print("Enter marks : ");
            int mark1 = input.nextInt();        
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();
            double avg = (mark1 + mark2 + mark3 + mark4)/4;
            System.out.println("Average is : " +avg);
             if (avg<50)
          {
             System.out.println("Overall Grade is : Fail");
          }
         else if (avg>49 && avg<75)
          {
             System.out.println("Overall Grade is : Credit");
          }
         else
          {
             System.out.println("Overall Grade is : Distinction");
          }
          System.out.println();
         }
  
     }
}