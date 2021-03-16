import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        // copy all the elements of array to another one
        int arr[] = {10, 11, 12};

        //original array
        System.out.println("original array: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        // create an array of same as array2
        int[] arr2;
        arr2 = arr;

        System.out.println("\n contents of new array: ");
        for (int j : arr2) System.out.print(j + " ");

        //create an array for 100 integers
        int[] arr3 = new int[100];

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arr3));
    }
}
