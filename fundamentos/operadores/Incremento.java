public class Incremento {
    public static void main(String[] args) {
        int desafioUm = 5;
        System.out.println(desafioUm += ++desafioUm);
        
        int desafioDois = 5;
        System.out.println(desafioDois += desafioDois++);

        System.out.println("desafio um: " + desafioUm);
        System.out.println("desafio dois: " + desafioDois);
    }
}
