
public class ExceptionHandling {
    public static void main(String[] args)
    {
        int[] marks = {10,20,30};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception)
        {
            System.out.println("Something went wrong...");
        }
        System.out.println("My name is Kashyap");
    }    
}
