import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Basics_II {
    public static void main(String[] args) {
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element at index " + i + ":");
            numbers[i] = sc.nextInt();
        }

        //Sorting an array (using built-in methods like Arrays.sort)
        Arrays.sort(numbers);
        System.out.println("Array:" + Arrays.toString(numbers));
        sc.close();

        //Merging two arrays (built-in methods or manual)
        int arr[] = {1,2,3};
        int arrb[] = {5,6,7};
        int mer[] = new int[arr.length + arrb.length];
        for(int i=0; i<arr.length; i++){
            mer[i] = arr[i]; // Copying elements of first array
        }
        for(int i=0; i<arrb.length; i++){
            mer[arr.length + i] = arrb[i]; // Copying elements of second array
        }
        System.out.println("Merged Array:" + Arrays.toString(mer));
        

        }


    }

