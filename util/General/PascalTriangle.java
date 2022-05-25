import java.util.Scanner;

public class PascalTriangle {

    public static int f(int num){
        int f =1;
        int i = 1;
        while(i<= num){
            f = f*i;
            i++;
        }
        return f;
    }


 
    public static void main(String[] args) {
        int i,j;
        System.out.println("Enter the number");
        
        Scanner input = new Scanner(System.in);
        int line = input.nextInt();
        input.close();

        for( i = 0; i< line; i++){
            // for giving space in trinagel 
            for( j = 0; j< line - i -1; j++){
                System.out.print(" ");
            }
            for( j = 0; j <= i; j++){
                System.out.print(" "+f(i)/(f(j)*f(i-j)));                       
            }
            
            System.out.println("");
        }
    
    }
}
