import java.util.Scanner;

public class Fibonacci1 {
 
    public static void main(String[] args) {
           int a = 0, b = 1, c;
           int count = 0;
           System.out.println("Enter the number");
           Scanner input = new Scanner(System.in);
           int num = input.nextInt();
           input.close();

           while (true) {
    //Something to be done repeatedly

          c = a+b;   
          count++;


          a=b;
          if(a>=num){
          break;
          }
          b=c;
            
         System.out.println(a);
    
    
}



    } 
}  


