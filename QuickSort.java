import java.io.*;

public class QuickSort {
    
static void swap(int[] arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

static int partition(int[] arr, int low, int high)
{

    int pivot = arr[high];
    int i = (low - 1);
 
    for(int j = low; j <= high - 1; j++)
    {
         
        if (arr[j] < pivot)
        {
            i++;
            swap(arr, i, j);
        }
    }
    swap(arr, i + 1, high);
    return (i + 1);
}
 


    public static void quickSort(int[] A, int low, int high) {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
        if (low < high) {
            int partitionIndex = partition(A, low, high);
            quickSort(A,low, partitionIndex - 1);
            quickSort(A, partitionIndex + 1, high);
        }
    }

   
    public static void printArray(int[] A, int n) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(A[i]);
        }
    }

    public static void main(String[] args) {

    int[] A = {9, 4, 8, 7, 5};
    int n = A.length;
  
      

        quickSort(A, 0, n-1);
        printArray(A, n);
    
    }
}









// do{
// System.out.println("do while loop started"+ i);
// i++;
// }while(i <= 0);

// while(i == -1){
// System.out.println("do while loop started"+ i);
// i++;
// }











 // public static int partition(int[] A, int low, int high) {

    //     int pivot = A[low];
    //     int i = low +1;
    //     int j = high;
    //     int temp;


     
        

    //     do {
    //         // start do
    //         while (A[i] <= pivot) {
    //             i++;
    //         }

    //         while (A[j] > pivot) {
    //             j--;

    //         }
    //         if (i < j) {
    //             temp = A[i];
    //             A[i] = A[j];
    //             A[j] = temp;
    //         }
    //     } while (i < j);

    //     temp = A[low];
    //     A[low] = A[j];
    //     A[j] = temp;

    //     return j;
    // }
