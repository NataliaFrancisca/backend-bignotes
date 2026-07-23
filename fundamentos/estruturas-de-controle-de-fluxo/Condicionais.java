import java.time.DayOfWeek;
import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        int a = 85;
        int b = 23;

        if (a > b)
            System.out.println(a + " é maior que " + b);

        b = a + b;

        if (b > a){
            System.out.println(b + " é maior que " + a);
        }

        int studentLevel = 2;

        if (studentLevel >= 3){
            System.out.println("aluno tem acesso a plataforma.");
        } else{
            System.out.println("aluno não tem acesso a plataforma.");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu acesso: ");
        int profesorA = scanner.nextInt();

        if (profesorA > 6){
            System.out.println("professor tem nível para acessar plataforma Genius.");
        } else if (profesorA > 3){
            System.out.println("professor tem acesso a plataforma Expert.");
        } else{
            System.out.println("professor tem acesso a plataforma Basic.");
        }

        // código para aprender rsrsrsrs
        System.out.println("Digite um número entre 1-5: ");
        int numero = scanner.nextInt();

        switch (numero){
            case 1:
                System.out.println("número um.");
                break;
            case 2:
                System.out.println("número dois.");
                break;
            case 3:
                System.out.println("número três.");
                break;
            case 4:
                System.out.println("número quatro.");
                break;
            case 5:
                System.out.println("número cinco.");
                break;
            default:
                System.out.println("número inválido");
        }

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        String isAdultMessage = age >= 18 ? "você é adulto!" : "você não é adulto!";
        System.out.println(isAdultMessage);

        System.out.println("Digite uma forma: ");
        Shape shape = Shape.valueOf(scanner.nextLine());

        switch (shape){
            case CIRCLE -> System.out.println("CIRCULO");
            case SQUARE -> System.out.println("QUADRADO");
        }

        System.out.println("Digite o dia da semana: ");
        DayOfWeek day = DayOfWeek.valueOf(scanner.nextLine());

        String message = switch (day){
            case MONDAY -> {
                System.out.println("starting the week!");
                yield "Back to work!";
            }

            case TUESDAY -> {
                System.out.println("week already started!");
                yield "monday is done!";
            }

            case WEDNESDAY -> {
                System.out.println("middle of the week!");
                yield "almost there";
            }

            case THURSDAY -> {
                System.out.println("week is finishing!!!!");
                yield "just one day left.";
            }

            case FRIDAY -> {
                System.out.println("Weekend is coming!");
                yield "Almost there!";
            }

            case SATURDAY, SUNDAY -> "Enjoy the weekend!";
        };

        System.out.println(message);
    }


}
