public class TiposPrimitivos {
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
    }
}
