class Rectangle{
    int length;
    int breadth;
    public void setArea()
    {
        length = 10;
        breadth = 20;
    }
    public int printResult()
    {
        return (length * breadth);
    }
}
public class Java39 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setArea();
        int resultArea = r1.printResult();
        System.out.println("The length of rectangle is : "+resultArea);
        System.out.println("The perimeter of rectangle is : "+(2*resultArea));
    }
}
