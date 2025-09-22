// Check weather a string is palindrome or not 

import java.util.Scanner;
public class Program32 {
    public static boolean isPalin(String str)
    {
        str = str.toLowerCase();
        int left =0, right = str.length()-1;
        while (left<=right) {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        if(isPalin(str))
        {
            System.out.println("String is plaindrome...");
        }
        else{
            System.out.println("String is not palindrome...");
        }

        sc.close();
    }
}
