public class Repeticao {
    public static void main(String[] args) {
        System.out.println("iniciando contagem....");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("contagem finalizada....");

        int i = 5;

        while (i < 5){
            System.out.println("número: " + i);
            i++;
        }

        int x = 5;
        do {
            System.out.println("número x: " + x);
            x++;
        } while (x < 5);

        System.out.println("número x é igual: " + x);

        // enhaced loop
        int[] arr = { 1,2,3,4,5,6,7,8,9,10 };

        for (int a: arr){
            System.out.println("yeahhh: " + a);
        }

        String[] names = {"nat", "leia", "luiz"};

        for (String name: names){
            System.out.println(name);
        }
    }
}
