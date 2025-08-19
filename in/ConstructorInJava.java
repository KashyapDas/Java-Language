package in;

class Students{
    String name;
    int age;
    String email;
    String password;

    Students(String name, int age, String email, String password)
    {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public void changePassword(String password)
    {
        this.password = password;
    }

    public void printUserData()
    {
        System.out.println(name + " "+age+" "+email+" "+password);
    }
}

public class ConstructorInJava {
    public static void main(String args[])
    {
        Students s1 = new Students("Kashyap Jyoti Das", 22, "kashyapdas2234@gmail.com", "Kashyap123@");
        s1.printUserData();

        s1.changePassword("Kashyap2234@");
        
        s1.printUserData();
    }
}
