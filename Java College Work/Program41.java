class MethodOverloadings{
    public void message(String name)
    {
        System.out.println("My name is : "+name);
    }
    public void message(String name, int age)
    {
        System.out.println("My name is : "+name+" and age is : "+age);
    }
    public void message(String name, int age, String country)
    {
        System.out.println("Name is : "+name+" age is : "+age+" and country is : "+country);
    }

}

public class Program41 {
    public static void main(String[] args) {
    MethodOverloadings m1 = new MethodOverloadings();
    m1.message("Kashyap");
    m1.message("Kashyap",22);
    m1.message("Kashyap",22,"India");

    }
}
