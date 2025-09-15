public class Program3{
    public static void main(String[] args)
    {
        int arr[] = {10,20,30,40,50,60,70,80};
        try{
            int length = arr[arr.length+1];
            System.out.println(length);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index not found...");
        }
        finally{
            System.out.println("This line of code will always run...");
        }
    }
    
}
