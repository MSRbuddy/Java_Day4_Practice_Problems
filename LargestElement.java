public class LargestElement {
    public static void main(String[] args) {
        int[] array = {5, 9, 2, 7, 1, 6};
        
	//To print elelments in the given array
        System.out.println("Elements of the array:");
        for (int i = 0; i < array.length; i++) 
 	{
            System.out.println(array[i]);
        }

        // Assume the first element as the largest
        int largest = array[0];

        // Iterate over the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("The largest element in the array is: " + largest);
    }
}