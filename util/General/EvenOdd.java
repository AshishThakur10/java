import java.util.Scanner;


public class EvenOdd {
    //question- to check number is even or odd 
    
    public static void main(String[] args) {
        
        int number;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number");
        
        number = input.nextInt();
        input.close();

        if (number % 2 == 0) {
        System.out.println("Number is even");           
        }

        else{
        System.out.println("Number is odd");           
        }

        
    }
}
