

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,2,3,4,5};

        int sum = 0;
        for (int num : arr) 
        {   // enhanced for loop
            sum += num;
        }

        // Print the sum 
        System.out.println("Sum : " + sum);

        sc.close();
    }
}
