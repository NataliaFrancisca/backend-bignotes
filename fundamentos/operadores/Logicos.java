public class Logicos {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        if (a > 10 && b > 10){
            System.out.println("os números são maior que 10.");
        } else{
            System.out.println("todos os números precisam ser maior que 10.");
        }

        int c = 20;
        int d = 40;

        if (c > 30 || d > 30){
            System.out.println("algum número é maior que 30.");
        } else{
            System.out.println("nenhum número é maior que 30.");
        }
    }
}
