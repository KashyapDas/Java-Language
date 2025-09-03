
class BaseClass{
    String name = "Kashyap";
    int age = 22;
    String location = "Sualkuchi Bazar Road";
}

class ChildClass extends BaseClass{
    String gender = "Male";
}

class grandChildClass extends ChildClass{

}

class grandChildClass1 extends grandChildClass{
    
}

class SiblingClass extends BaseClass{
    String state = "Assam";
}

public class Inheritance {
    public static void main(String args[])
    {
        // Use of Single Inheritance
        ChildClass c1 = new ChildClass();
        System.out.println(c1.name);
        
        // Use of Melti-level Inheritance
        grandChildClass g1 = new grandChildClass();
        System.out.println(g1.name+" "+g1.age+" "+g1.location+" "+g1.gender);

        //Use of Hierarchial Inheritance
        grandChildClass1 gc1 = new grandChildClass1();
        System.out.println(gc1.gender);
        
        // Multiple Inheritance - we use interface keyword fot this 
        
    }
    
}