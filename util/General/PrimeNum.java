import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
       
        int number;
        int count = 0;
        System.out.println("Enter the number");

        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        input.close();

        for(int i = 1; i<= number; i++){
            if(number % i == 0){
                count ++;
            }
        } 
         
        if(count == 2){
            System.out.println("Prime number" + number);
        }else{
            System.out.println("not a Prime number " + number);
        }
    }
}
