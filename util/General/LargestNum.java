import java.util.Scanner;

public class LargestNum {

    public static void main(String[] args) {
        System.out.println("started");
        int n;
        int[]a;
        
        System.out.println("Enter the number ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        a = new int[n];

        
        for(int i=0; i<n; i++){
            a[i] = input.nextInt();
        }

        int max = maxnum(a, n);

        System.out.println("the max num" + max);

        input.close();
    }

    public static int maxnum(int[]a, int n){

        int lNum = 0;

        for(int i = 0; i<n; i++){
            if(a[i]>lNum){
                lNum = a[i];
            }
        }
        return lNum;
    }
    
}
