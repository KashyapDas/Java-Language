package in;

class  PolymorphismConcept{
    String name;
    int age;

    // Same function name with different parameter. This concept is called Polymorphism
    public int info(int age)
    {
        return age;
    }
    public String info(String name)
    {
        return name;
    }

}

public class Polymorphism {
    public static void main(String args[])
    {
        PolymorphismConcept p1 = new PolymorphismConcept();
        String name = p1.info("Kashyap Jyoti Das");
        int age = p1.info(22);

        System.out.println("My name is "+name);
        System.out.println("My age is "+age);

    }    
}
