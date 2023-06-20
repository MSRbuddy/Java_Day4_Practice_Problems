import java.util.Arrays;
 
class FrequencyCount
{
public static void countFreq(int arr[], int n)
{
    boolean visited[] = new boolean[n];
     
    Arrays.fill(visited, false);
 
    // Traverse through array elements and count frequencies
    
    for (int i = 0; i < n; i++) {
 
        // Skip this element if already processed
        if (visited[i] == true)
            continue;
 
        // Count frequency
        int count = 1;
        for (int j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                visited[j] = true;
                count++;
            }
        }
        System.out.println("Frequency of " + arr[i] + " is : " + count + " times");
    }
}
 
public static void main(String []args)
{
    int arr[] = new int[]{ 10, 20, 30, 10, 50, 20, 50, 20 };
    int n = arr.length;
    countFreq(arr, n);
}
}
 