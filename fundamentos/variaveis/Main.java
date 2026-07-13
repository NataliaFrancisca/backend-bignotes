public class Main {
    public static void main(String[] args) {
        // variáveis
        String name = "Nat";
        int age = 26;
        boolean isAvailable = false;

        // usando inferência de tipo
        var lastName = "Francisca";
        var year = 2026;
        var isOpen = true;

        System.out.println("Student Name: " + name.concat(" ").concat(lastName));

        // não precisamos declarar o tipo daquela variável, mas ela ainda é tipada
        // lastName têm uma valor do tipo String
        // então essa variável deve somente receber valores do tipo String
        // lastName = 2023; ❌

        // não podemos declarar uma variável com var e não passar um valor
        // Cannot use 'var' on variable without initialize
        // var score; ❌
        var score = 10;
        score = 20;


        // FINAL > variáveis que usam final não podem ser alteradas futuramente
        final String professorName = "Nat";
        System.out.println("Professor Name: " + professorName);
        // professorName = "Natalia"; ❌
    }
}
