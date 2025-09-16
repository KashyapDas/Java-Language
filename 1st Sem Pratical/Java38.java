class Person{
    String name;
    int age;
    public void setInfo(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void printName()
    {
        System.out.println("My name is : "+this.name);
        System.out.println("My age is : "+this.age);
    }
}
public class Java38{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.setInfo("Kashyap", 22);
        Person p2 = new Person();
        p2.setInfo("Chinmoy", 23);
        p1.printName();;
        p2.printName();
    }
}