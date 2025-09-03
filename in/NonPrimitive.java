
public class NonPrimitive {
    public static void main(String[] agrs)
    {
        String firstName = new String("Kashyap");
        String middleName = "Jyoti";
        String lastName = "Das";

        // Length of the String
        System.out.println(firstName.length());
        // Concatenate and print the string
        String name = firstName + " " + lastName;
        System.out.println(name);
        // charAt to check what element is present in a particular index
        System.out.println(middleName.charAt(0));
        // Substring to extract a part of a string
        System.out.println(firstName.substring(0, 7));

    }
}
