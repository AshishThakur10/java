import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        System.out.println("Enter the number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.close();

        for(int i = 0; i<= num; i++){
            System.out.println(a);
            c = a+b;   
            a=b;
            b=c;
            
        }

    } 
}  
