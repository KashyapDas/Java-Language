

public class TwoDArray {
    public static void main(String[] args)
    {
        int[][] finalMarks = {{80,20,50},{30,60,100}};

        for(int i=0; i<finalMarks.length; i++)
        {
            for(int j=0; j<finalMarks[i].length; j++)
            {
                System.out.println(finalMarks[i][j]);
            }
        } 

    }
}
