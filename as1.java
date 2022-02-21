/*
Assignment:
wap to read and display Student details?
Note:
 (i)read stuName,rollNo,branch
 (ii)read six sub marks
     =>Each Sub marks must be in b/w 0 to 100,else invalid marks
 (iii)If Six sub marks are validated then calcute the following:
         totMarks = 
         per      =
         result   = 
Result:
  per---> 70 to 100 ==> Destinction
          60 to <70 ==> FirstClass
          50 to <60 ==>SecondClass
          35 to <50 ==>ThirdClass
             else   ==> Fail
*/

import java.util.Scanner;

class as1 {

    static Scanner s = new Scanner(System.in);

    static String stuName;
    static int rollNo;
    static String branch;

    static int mathsMarks;
    static int computerMarks;
    static int englishMarks;
    static int scienceMarks;
    static int hindiMarks;
    static int sstMarks;

    static float totalMarks; 
    static float percentage;
    static String grade;


    public static void main(String[] args) {

        stuDetails();

        maths();

        while (mathsMarks >= 101 || mathsMarks <= 0) {
            System.out.println("it's not a valid marks");
            System.out.println(mathsMarks);
            maths();
        }

        computer();

        while (computerMarks >= 101) {
            System.out.println("it's not a valid marks");
            System.out.println(computerMarks);
            computer();
        }

        english();
        while (englishMarks >= 101) {
            System.out.println("it's not a valid marks");
            System.out.println(englishMarks);
            english();
        }

        science();
        while (englishMarks >= 101) {
            System.out.println("it's not a valid marks");
            System.out.println(scienceMarks);
            science();
        }

        hindi();
        while (englishMarks >= 101) {
            System.out.println("it's not a valid marks");
            System.out.println(hindiMarks);
            hindi();
        }

        sst();
        while (englishMarks >= 101) {
            System.out.println("it's not a valid marks");
            System.out.println(sstMarks);
            sst();
        }

        result();
        grads();

        System.out.println("the name of Student = " + stuName);
        System.out.println("Roll number = " + rollNo);
        System.out.println("Branch = " + branch);

        System.out.println("Total marks = " + totalMarks);
        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);


    }

    // STUDENT DETAILS START
    public static void stuDetails() {
        // stuName,rollNo,branch

        System.out.println("Enter studet name");
        stuName = s.nextLine();

        System.out.println("Enter rollNO");
        rollNo = s.nextInt();

        System.out.println("Enter branch");
        branch = s.nextLine();
        
    }
    // ENDS

    // subjects functions START

    public static int maths() {
        System.out.println("Enter the marks of maths");
        return mathsMarks = s.nextInt();
    }

    public static void computer() {
        System.out.println("Enter the marks of computer");
        computerMarks = s.nextInt();
    }

    public static void english() {
        System.out.println("Enter the marks of english");
        englishMarks = s.nextInt();
    }

    public static void science() {
        System.out.println("Enter the marks of science");
        scienceMarks = s.nextInt();
    }

    public static void hindi() {
        System.out.println("Enter the marks of hindi");
        hindiMarks = s.nextInt();
    }

    public static void sst() {
        System.out.println("Enter the marks of sst");
        sstMarks = s.nextInt();
    }

    // ENDS

    // calculate resut START
    public static void result(){
        totalMarks = mathsMarks + computerMarks + englishMarks + sstMarks + scienceMarks + hindiMarks;
        percentage = (totalMarks/600)*100;

    }
    //ENDS
    
    //grade START


    public static void grads(){
        if(percentage >= 70 && percentage <= 100 ){
           grade = "Destinction";
        }else if(percentage >=60 && percentage <70){
            grade = "FirstClass";
        }else if(percentage >=50 && percentage <60){
            grade = "SecondClass";
        }else if(percentage >=35 && percentage <50){
            grade = "ThirdClass";
        }
        else{
            grade = " fail";
        }
    }
    //ENDS

}
