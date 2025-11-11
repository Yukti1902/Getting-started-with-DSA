import java.util.*;
public class Arrays_Basics
{
    public static void main (String[] args)
    {
        //Initialization and Declaration of an array of fixed size
        System.out.println("Basic initialization, declaration and output of an array");
        int[] num = new int[3];

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        for(int i=0; i<3; i++){
            System.out.println(num[i]);
        }

        //Declaration and Memory allocation (user input)
        System.out.print("Enter the size of an array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //Initialization and Input (user input)
        System.out.println("----Enter the elements of an array----");
        for(int i=0; i<size; i++)
        {
            System.out.print("Element at index " + i + ":");
            numbers[i] = sc.nextInt();
        }

        //Traversing and output
        System.out.println("----Elements of an array----");
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
        //Length of an array
        System.out.println("The length of the array is: " + numbers.length);

        //Calculating sum and average of elements
        int sum = 0;
        for(int i=0; i<size; i++){
            sum += numbers[i];
        }
        System.out.println("The sum of Array: " + sum);

        float avg = 0;
        for(int i=0; i<size; i++){
            avg = sum/size;
        }
        System.out.println("Average of the elements of Array: " + avg);

        //Traversing and output in array format
        System.out.println("----Elements in array format (for output)----");
        System.out.println(Arrays.toString(numbers));
        sc.close();
    } 
   
}
