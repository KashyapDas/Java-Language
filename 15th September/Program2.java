public class Program2 {
    public static void main(String args[])
    {
        int arr[] = {10,20,30,40,50};
        String number = "123a"; 

        try {
            int elem = arr[arr.length+1]; 
            System.out.println(elem);

            int value = Integer.parseInt(number);  
            System.out.println(value);

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound...");
        } catch(ArithmeticException e) {
            System.out.println("Number not divided...");
        } catch(NumberFormatException e) {
            System.out.println("Type casting not converted...");
        }
    }
}
