public class DuplicateElement 
{  
   public static void main(String[] args) 
   {  
    //Initialize array  
     int [] arr = new int [] {1, 2, 3, 8, 2, 6, 7, 4, 8, 3, 5, 6};  

     System.out.println("Elements of the array:");
        for (int i = 0; i < arr.length; i++) 
	{
            System.out.println(arr[i]);
        }

     System.out.println("Duplicate elements in given array: ");  
     //Searches for duplicate element  
     for(int i = 0; i < arr.length; i++) 
     {  
        for(int j = i + 1; j < arr.length; j++) 
        {  
            if(arr[i] == arr[j])  
            System.out.println(arr[j]);  
        }  
     }  
   }  
}  