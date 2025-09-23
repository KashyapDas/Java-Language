public class MergeSort {
    public static void Merge(int[] arr , int low, int high, int mid)
    {
        int length1 = mid-low+1; // memory required for the first sub-array
        int length2 = high - mid; // memory required for the second sub-array
        int startIndex = low; // point to the first index of the original array
        int[] Larr = new int[length1]; // create the dynamic array of the length1
        int[] Rarr = new int[length2]; // create the dynamic array of the length2
        // Copy the element from the original array to the both sub-array
        for(int i=0; i<length1; i++)
        {
            // This will the copy required element of the original array to the new left array
            Larr[i] = arr[startIndex++];
        }
        // for the right array the start index will come from (mid +1). That why we update the startindex to (mid+1)
        startIndex = mid+1;
        for(int i=0; i<length2; i++)
        {
            // This will the copy required element of the original array to the new right array
            Rarr[i] = arr[startIndex++];
        }
        // create two pointer, each of them point to the first index of the new array
        int Lindex = 0;
        int Rindex = 0;
        startIndex = low;
        // sorted the two sub-array
        while ((Lindex < length1) && (Rindex < length2)) {
            if(Larr[Lindex] < Rarr[Rindex])
            {
                arr[startIndex++] = Larr[Lindex++];
            }
            else{
                arr[startIndex++] = Rarr[Rindex++];
            }
        }
        // If the 1st array have element present but 2nd array not then
        while(Lindex < length1)
        {
            arr[startIndex++] = Larr[Lindex++];
        }
        // If the 2nd array have element present but 1st array not then
        while(Rindex < length2)
        {   
            arr[startIndex++] = Rarr[Rindex++];
        }
    }
    public static void MergeSorting(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int mid = (low + high)/2;
            MergeSorting(arr, low, mid);
            MergeSorting(arr, mid+1, high);
            Merge(arr,low,high,mid);
        }
    }
    public static void Print(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {20,40,10,30,70,50};
        int low = 0;
        int high = arr.length -1;
        MergeSorting(arr,low,high);
        Print(arr);
    }
}
