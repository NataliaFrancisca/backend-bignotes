package fundamentos.tiposDados;

public class Main {
    public static void main(String[] args) {
        TiposPrimitivos primitivos = new TiposPrimitivos();

        int age = 26;
        double price = 20.90;
        boolean isStudent = true;
        char courseClass = 'A';

        primitivos.askForAge();
        primitivos.askForPrice();
        primitivos.askIfIsStudent();
        primitivos.askWhichClassIs();

    }
}
