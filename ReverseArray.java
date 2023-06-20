public class ReverseArray {  
    public static void main(String[] args) 
	{ 
 
        //Initialize array  
        int [] array = new int [] {10, 20, 30, 40, 50};  
        System.out.println("Initial array: ");  
        for (int i = 0; i < array.length; i++) 
	{  
            System.out.println(array[i] + " ");  
        }  

        System.out.println("Array in reverse order: ");  
        //Loop through the array in reverse order  
        for (int i = array.length-1; i >= 0; i--) 
	{  
            System.out.println(array[i] + " ");  
        }  
    }  
}  