package fundamentos.tiposDados;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TiposPrimitivos {
    private Scanner scanner = new Scanner(System.in);

    public void askForAge(){
        System.out.println("type your age: ");

        try{
            int age = this.scanner.nextInt();

            if (age < 0) {
                throw new IllegalArgumentException("Idade deve ter um valor positivo.");
            } else if(age < 18){
                System.out.println("Você é menor de idade...");
            } else{
                System.out.println("Você é maior de idade...");
            }

        }catch(InputMismatchException ex){
            System.out.println("Digite um valor válido para o campo idade. ");
        }
    }

    public void askForPrice(){
        System.out.println("type the price: ");

        try{
            double price = this.scanner.nextDouble();

            if (price == 0) {
                System.out.println("The product is free...");
            }else if(price < 0){
                throw new IllegalArgumentException("Price must be positive.");
            } else{
                System.out.println("The product cost: " + price);
            }

        }catch(IllegalArgumentException ex){
            System.out.println("O preço deve ser um valor positivo.");
        } catch(InputMismatchException ex){
            System.out.println("Digite um valor válido para o campo preço.");
        }
    }

    public void askIfIsStudent(){
        System.out.println("are you a student? ");

        try{
            boolean isStudent = this.scanner.nextBoolean();

            if (isStudent) {
                System.out.println("you are a student....");
            }else{
                System.out.println("you are not a student....");
            }
        }catch(InputMismatchException ex){
            System.out.println("Digite um valor válido para a pergunta.");
        }
    }

    public void askWhichClassIs(){
        System.out.println("Which class are you? ");

        try{
            String courseClassInput = this.scanner.next();

            if (courseClassInput.matches("[a-zA-Z\\s]+")) {
                char courseClass =  courseClassInput.charAt(0);
                System.out.println("Você faz parte da turma: " + courseClass);
            } else{
                throw new IllegalArgumentException("A classe deve conter apenas um caracter e deve ser letra.");
            }
        } catch (IllegalArgumentException ex){
            System.out.println("Digite um valor válido para a sala de aula.");
        }
    }

}
