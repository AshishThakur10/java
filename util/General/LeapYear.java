import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        
        System.out.println("Enter the year");
        Scanner input = new Scanner(System.in);
        year = input.nextInt();

        if(year % 400 == 0){
            System.out.println("Leap year "+ year);
        }else if(year % 4 == 0){
            System.out.println("Leap year "+ year);
        }else{
            System.out.println(" not a leap year " + year);
        }
    }
}
