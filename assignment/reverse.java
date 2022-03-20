import java.util.Scanner;

public class reverse {
    // 1.wap to read a number and display the reverse of given number?
    static int reverseInt(int n){
        int rev_num = 0;
        while(n>0){
            rev_num = rev_num * 10 + n %10;
            n = n/10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter the Number");
        int num = s.nextInt();
        int rev_num = reverseInt(num);
        System.out.println("the reverse of the given num = "+rev_num);
    }
}