import java.util.Scanner;

// swap using three var   wait 

public class swap2n {
    public static void main(String[] args) {
        System.out.println("Enter the 1st number");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        System.out.println("Enter the 2nd number");
        int y = input.nextInt();

        input.close();

        int temp = x;
        x = y;
        y = temp;

        System.out.println("swap "+ "1st = "+ x + "\n2nd = "+ y);
    }
}
