import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        System.out.println("Enter the word");

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        StringBuffer a = new StringBuffer(word);
        String b = a.reverse().toString();

        if(b.equals(word)){     //b == word not use
            System.out.println("it is a palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}
