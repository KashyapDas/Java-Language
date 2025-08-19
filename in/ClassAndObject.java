package in;

class Marks{
    int maths;
    int science;
    int english;
    int computer;
    int total;

    Marks(int maths, int science, int english, int computer)
    {
        this.total = maths + science + english + computer;
    }

    public void printTotalMarks()
    {
        System.out.println(this.total);
    }

}

class Student{
    String name;
    int age;
    String location;

    // methods
    public void printInfo()
    {
        System.out.println(name + " "+age+" "+location);
    }
}

public class ClassAndObject{
    public static void main(String args[])
    {
        // Student Object
        Student s1 = new Student();
        s1.name = "Kashyap";
        s1.age = 22;
        s1.location = "Assam";

        s1.printInfo();
 
        // Marks object
        Marks kashyap = new Marks(90,70,100,50);
 
        kashyap.printTotalMarks();
    }
}