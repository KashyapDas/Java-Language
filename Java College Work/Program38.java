import java.util.Scanner;

class Book{
    private String title;
    private String Author;
    private String ISBN;
    private int price;

    public void setterMethod(String title, String Author, String ISBN, int price)
    {
        this.title = title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public void getterMethod()
    {
        System.out.println("Title : "+title);
        System.out.println("Author : "+Author);
        System.out.println("ISBN : "+ISBN);
        System.out.println("Price : "+price);
    } 

    Book(String title, String Author, String ISBN, int price){
        this.title = title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.price = price;
    }
}

public class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("Intro to Java", "James Watt", "BB7102I900IIHVN", 299);
        b1.setterMethod("Intro to C", "Ramesh", "O12Q73200BVSI7", 299);
        b1.getterMethod();

        sc.close();
    }
}
