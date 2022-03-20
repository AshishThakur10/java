import java.util.Scanner;

//package assignment;
public class Palindrome {
    // 2.wap to to check the given number is Palindrome number or not?


    static int reverseInt(int n){
        int rev_num = 0;
        while(n > 0 ){
            rev_num = rev_num * 10 + n % 10 ;
            n = n/10;
        }
        return rev_num;
    }

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
       int rev_num =  reverseInt(n);

       if (rev_num == n){
           System.out.println("it a PALINDROME");
       }else{
           System.out.println("it's not a Palindrome");
       }

       System.out.println(rev_num);
    }

}
