

public class Program1{
    public static void main(String[] args)
    {
        int arr[] = {10,20,3,40,50,60,70,};
        int length = (arr.length - 1);
        try{
            int fault =  arr[length +1];
            System.out.println(fault);
        }catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

    }
}
