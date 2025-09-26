// Program to find the prime no in a given range

import java.util.Scanner;
public class Program1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range you want to find the prime no : ");
        int firstRange = sc.nextInt();
        int secondRange = sc.nextInt();
        
        for(int i=firstRange; i<=secondRange; i++)
        {
            if(i==1) continue;
            if((i==2) || (i==3) || (i==5) || (i==7) ) System.out.println("Prime number are : "+i);

            if((i%2 != 0) && (i%3!=0) && (i%5 != 0) && (i%7 != 0) )
            {
                System.out.println("Prime number are : "+i);
            }
        }

        sc.close();
    }
}