
public class BreakContinue {
    public static void main(String[] args)
    {
        int a = 0;
        while(true)
        {
            if(a==10)
            {
                break;
            }
            else if(a==5)
            {
                a++;
                continue;
            }
            else{
                System.out.println(a);
            }
            a++;
        }
    }
}
