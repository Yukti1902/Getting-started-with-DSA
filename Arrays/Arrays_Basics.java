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

        //Updating an element in array at a specific index
        System.out.println("Enter the index that you want to update:");
        int index = sc.nextInt();
        System.out.println("Enter the new value:");
        int newValue = sc.nextInt();
        numbers[index] = newValue;
        System.out.println("Updated array: " + Arrays.toString(numbers));

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

        //Reversing an array (Basic swap approach)
        System.out.println("----Reversing the array----");
        int start = 0;
        int end = numbers.length - 1;
        while(start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array: " + Arrays.toString(numbers));

        //Deleting elements (set to default value: 0)
        System.out.println("----Deleting the elements of the array----");
        for(int i =0; i<size; i++){
            int newvalueone = 0; 
            numbers[i] = newvalueone; //alternate approach: Arrays.fill(numbers, 0)
        }
        System.out.println("Resulted array: " + Arrays.toString(numbers));
    } 
}
