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

        //Copying an array (System.arraycopy, clone, Arrays.copyOf)
        int org[] = {10,20,30,40,50};
        int copy[] = new int[org.length];
        System.arraycopy(org,0,copy,0,org.length);
        System.out.println("Original Array: " + Arrays.toString(org));
        System.out.println("Copied Array: " + Arrays.toString(copy));

        //Comparing two arrays (Arrays.equals)
        int arrone[] = {1,2,3,4,5};
        int arrtwo[] = {1,2,3};
        System.out.println("Are the arrays equal?" + Arrays.equals(arrone,arrtwo));

        //Converting array to String (Arrays.toString)
        int nums[] = {10,23,45,67};
        System.out.println("ARRAY: " + Arrays.toString(nums));

        //Converting string to array (split, toCharArray)
        String str = "Hello we are writing the code in java";
        String words[] = str.split(" ");
        System.out.println("Array of String: " + Arrays.toString(words));
        char chr[] = str.toCharArray();
        System.out.println("Array of Characters: " + Arrays.toString(chr));

        //Frequency of elements (basic HashMap / loop)
        int freq[] = {2,3,4,4,7,2,5,7,8};
        int count = 0;
        for(int i=0; i<freq.length; i++){
            count = 0;
            for(int j =0; j<freq.length; j++){
                if(freq[i] == freq[j]){
                    count++; //incrementing count
                } 
            }
            System.out.println("Frequency of " + freq[i] + "is" + count);
        }
        }


    }
