import java.util.Scanner;

public class PerfectNumber {
   public static void main(String[] args) {
      System.out.println("Enter the number");
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      input.close();
      System.out.println("u have enter number " + num);

      int sum = 0;

      for (int i = 1; i <= num - 1; i++) {
         if (num % i == 0) {
            sum = sum + i; // sum += i;
         }

         else {
            System.out.print("");
         }
      }
      int totalSum = sum;
      System.out.print(" " + totalSum);

      if (totalSum == num) {
         System.out.println("The number is perfect");

      } else {
         System.out.println("The number is no perfect");
      }

      // (factor) 1 2 4 7 14 = 28 is perfect number

   }
}
