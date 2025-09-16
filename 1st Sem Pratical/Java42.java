class Student{
    int rollNo;
    int Marks;
    public void setInfo(int rollNo, int Marks)
    {
        this.rollNo = rollNo;
        this.Marks = Marks;
    }
    public void display()
    {
        System.out.println("My roll no is : "+rollNo);
        System.out.println("My marks is : "+Marks);
    }
}

public class Java42 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setInfo(11, 76);
        s1.display();
    }    
}
