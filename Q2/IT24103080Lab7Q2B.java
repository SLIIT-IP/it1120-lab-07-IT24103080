public class IT24103080Lab7Q2B
{
     public static void main(String[] args)
     {
         int i;
         int j;
         for(i=1; i<=5; i++)
         {
            System.out.print(i +" - ");
            for(j=1; j<=i; j++)
            {
               System.out.print("* ");
            }
            System.out.print("\n");
         }
      }
}