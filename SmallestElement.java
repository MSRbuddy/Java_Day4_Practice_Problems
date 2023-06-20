public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {6, 11, 31, 27, 5, 63};
        
	//To print elelments in the given array
        System.out.println("Elements of the array:");
        for (int i = 0; i < array.length; i++) 
 	{
            System.out.println(array[i]);
        }

        // Assume the first element as the smallest
        int smallest = array[0];

        // Iterate over the array to find the smallest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}