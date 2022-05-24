import java.util.Scanner;
public class swap2N {

// swap useing two var
    public static void main(String[] args) {

        System.out.println("Enter the 1st number");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(); // 3

        System.out.println("Enter the 2nd number");
        int b = input.nextInt(); // 2
        input.close();

        a = a+b;  // 3+2 = 5
        b = a-b;  // 5-2 = 3
        a = a-b;  // 5-3 = 2

        System.out.println("swap "+ "1st = "+ a + "\n2nd = "+ b);

    }
}
