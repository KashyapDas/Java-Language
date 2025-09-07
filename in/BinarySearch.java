public class BinarySearch {

    public static int findElement(int arr[],int find)
    {
        int start = 0;
        int end = (arr.length-1);
        int mid = (start+end)/2;
        
        while (start<=end) {
            if(arr[mid] == find)
            {
                return mid;
            }
            else if(arr[mid]>find)
            {
                end = mid-1;
            }
            else{
                start = mid +1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int find = 90;
        int result = findElement(arr,find);
        System.out.println(result);
        if(result != -1)
        {
            System.out.println(find+" is found in the index no : "+result);
        }
        else{
            System.out.println(find+" is not present in the array");
        }
    }
}
