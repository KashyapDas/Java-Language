public class Program2 {
    public static String vowelRemove(String str)
    {
        String newStr = "";
        for(int i=0; i<str.length(); i++)
        {
            if((str.charAt(i) != 'a') && (str.charAt(i) != 'e') && (str.charAt(i) != 'i') && (str.charAt(i) != 'o') && (str.charAt(i) != 'u') )
            {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "kashyap das";
        String result = vowelRemove(str);
        System.out.println(result);
    }
}
