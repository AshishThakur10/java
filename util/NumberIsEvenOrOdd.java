import java.util.Scanner;

class NumberIsEvenOrOdd{
    public static void main(String[] args) {
       int x;
       Scanner sc = new Scanner(System.in);
       x = sc.nextInt();
       if(x%2 == 0){
           System.out.println("Even number " + x);
       } else{
           System.out.println("Odd number " + x);
       }
       sc.close();
    }
}