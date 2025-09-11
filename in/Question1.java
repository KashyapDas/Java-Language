import java.util.Scanner;

class Info {
    String name;
    int age;

    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("The name of the person : " + this.name);
        System.out.println("The age of the person : " + this.age);
    }
}

public class Question1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Info hu1 = new Info();
        Info hu2 = new Info();

        System.out.print("Enter the name of the 1st person: ");
        String name = sc.nextLine();
        System.out.print("Enter the age of the 1st person: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume leftover newline

        hu1.setName(name, age);
        hu1.printInfo();

        System.out.print("Enter the name of the 2nd person: ");
        name = sc.nextLine();
        System.out.print("Enter the age of the 2nd person: ");
        age = sc.nextInt();
        sc.nextLine();  // Consume leftover newline

        hu2.setName(name, age);
        hu2.printInfo();

        sc.close();
    }
}
