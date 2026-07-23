import java.util.Scanner;

public class TiposReferencia {
    public static void main(String[] args) {
        Student student = new Student("Nat");
        student.print();
        System.out.println('\n');

        student.setName("natalia francisca");
        student.setClass("biologia");
        student.setClass("biologia");
        student.setClass("física");
        student.setClass("Biologia");
        student.setGrades(10);
        student.setGrades(8);
        student.print();
        System.out.println('\n');

        System.out.println("how many days account was created: " + student.howManyDaysAccountWasCreated());

        // String
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name for player 1: " );
        String name1 = scanner.next();

        System.out.println("Enter the name for player 2: " );
        String name2 = scanner.next();

        System.out.println("Enter the name for player 3: " );
        String name3 = scanner.next();

        System.out.println("name 1 is equal to name 2? " + name1.equals(name2));

        System.out.println("equal names: ");
        System.out.println("name 1 is equal to name 3? " + name1.equals(name3));
        System.out.println("name 1 is equal to name 3? " + name1.equalsIgnoreCase(name3));
    }
}
