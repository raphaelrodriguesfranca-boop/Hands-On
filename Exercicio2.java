import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("Maior: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("Maior: " + numero2);
        } else {
            System.out.println("Iguais");
        }

        entrada.close();
    }
}
