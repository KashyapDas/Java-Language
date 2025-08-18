package in;

import java.util.Arrays;

public class ArrayInJava {
    public static void main(String args[])
    {
        // Dynamic Type to create and access Array
        int[] marks = new int[3];
        marks[0] = 420;
        marks[1] = 60;
        marks[2] = 80;

        for(int i=0; i<marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        // Static Type to create and access Array
        String[] name = {"Kashyap","Jyoti","Das"};

        for(int i=0; i<name.length; i++)
        {
            System.out.println(name[i]);
        }

        // Sort the Array but we the Array package for that
        Arrays.sort(marks);
        for(int j=0; j<marks.length; j++)
        {
            System.out.println(marks[j]);
        }

        
    }
}
