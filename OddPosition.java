public class OddPosition {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	//print elements of given array 
	System.out.println("Elements of the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Elements at odd positions:");
        for (int i = 0; i < array.length; i = i+2) {
            System.out.println(array[i]);
        }
    }
}