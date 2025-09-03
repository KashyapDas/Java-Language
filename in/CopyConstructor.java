
class OurStudent{
    String name;
    int age;
    String location; 

    OurStudent(){}

    OurStudent(OurStudent o1)
    {
        this.name = o1.name;
        this.age = o1.age;
        this.location = o1.location;
    }

}


public class CopyConstructor{
    @SuppressWarnings("unused")
    public static void main(String args[])
    {
        OurStudent o1 = new OurStudent();
        o1.name = "Kashyap";
        o1.age = 22;
        o1.location = "Assam";

        OurStudent o2 = new OurStudent(o1);
    }
}