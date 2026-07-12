package fundamentos.tiposDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // principais tipos primitivos
        int age = 26;
        double price = 20.90;
        boolean isStudent = true;
        char courseClass = 'A';

        // INTEGER
        byte phoneB = 123;
        short phoneS = 12345;
        int phoneI = 1234567890;
        long phoneL = 12345678998765432L;

        // FLUTUANTE
        float priceF = 120.30f;
        priceF = 1200.20f;
        priceF = 20000.30f;
        System.out.println("price f: " + priceF);

        double priceD = 1.50;
        priceD = 20.30;
        priceD = 50000.50;
        System.out.println("price d: " + priceD);

        double priceFloatAsDouble = (double) priceF;
        System.out.println("priceFloatAsDouble: " + priceFloatAsDouble);

        priceD = priceD * Double.MAX_VALUE;
        System.out.println("priceD: " + priceD);

        // principais tipos referencia
        TiposReferencia tiposReferencia = new TiposReferencia("natalia");

        tiposReferencia.print();
        System.out.println('\n');

        tiposReferencia.setName("natalia francisca");
        tiposReferencia.setClass("biologia");
        tiposReferencia.setClass("biologia");
        tiposReferencia.setClass("física");
        tiposReferencia.setClass("Biologia");
        tiposReferencia.setGrades(10);
        tiposReferencia.setGrades(8);
        tiposReferencia.print();
        System.out.println('\n');

        System.out.println("how many days account was created: " + tiposReferencia.howManyDaysAccountWasCreated());

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
