

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] agrs)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch(day)
        {
            case 1 :
                System.out.println("monday");
                break;
            case 2 :
                System.out.println("tuesday");
                break;
            case 3 :
                System.out.println("wednesday");
                break;
            default :
                System.out.println("Put 1,2,3");
        }
    }    
}
