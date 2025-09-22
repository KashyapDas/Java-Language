// Program to reverse a string

import java.util.Scanner;

public class Program31
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        sc.close();
        String reversed = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reversed += str.charAt(i);
        }
        System.out.println("Reverse string :  "+reversed);
    }
}