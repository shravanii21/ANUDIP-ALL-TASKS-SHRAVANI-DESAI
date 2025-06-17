import java.util.Arrays;

public class ArrayFunctions {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 4};

        Arrays.sort(arr); // Sorts the array

        System.out.println("Sorted array: " + Arrays.toString(arr)); // [1, 3, 4, 5]

        int index = Arrays.binarySearch(arr, 4); // Searches for 4
        System.out.println("Index of 4: " + index);
    }
}
