

import java.util.Scanner;

public class bankTr {
    static boolean checkPin;
    
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int balance=100;

        System.out.println("Welcome to  BANK");
        System.out.println("Enter Your PIN");
        
        int pin = s.nextInt(); 

        PinStatus(pin);
        
        if(checkPin){
            transation(balance);
        }else{
            System.out.println("Invalid PIN");
        }
    }

    static void PinStatus(int pin){
        //CHECK PIN START
        if(pin == 1234 || pin == 1111 ){
            checkPin = true;

        }else{
            System.out.println("Invalid PIN");
            checkPin = false;
        }
        //ENDS
    }

    static void transation(int balance){
        

        System.out.println("Choose the option 1 for withdrow  2 for Deposit ");
        int tOption = s.nextInt();
        switch (tOption) {
            case 1:
                withdrow(balance);
                break;
            case 2:
                deposit(balance);
                break;
            default:
                System.out.println("not a vaid option");
                break;
        } 
    }

    static void withdrow(int balance){
        System.out.println("Enter the amount");
        int amount = s.nextInt();
        if(amount < balance){
            balance = balance - amount;
            System.out.println("your amout is debeted please collect the cash");
            System.out.println("Current Balance "+ balance);
            System.out.println("Thank you ");
        }else{
            System.out.println("enter the valid amount");
        }
    }

    static void deposit(int balance){
        System.out.println("enter the amount to deposit");
        int deposit = s.nextInt();
        balance = balance + deposit;
        System.out.println("Thank you Your current balnace is = " + balance+"rs");
    }


}
