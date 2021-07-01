package finalExam;

public class MainBook {
    public static void main(String []args) {
        Book newbook = new Book("Raymond Bahana", "Superheroes are Real", 15.50, 1719);
        Book newbook2 = new Book("Nunung Nurul", "Falling in love with Polymorphism", 12.80, 1902);
        Book newbook3 = new Book("Jude Martinez", "Bleh Bleh Bleh Bleh", 9.50, 1996);

        System.out.println(newbook.toString());
        System.out.println(newbook2.toString());
        System.out.println(newbook3.toString());
    }

}
