import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        System.out.print("Escolha uma opcao: ");
        int opcao = entrada.nextInt();

        System.out.print("Digite o primeiro numero: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double numero2 = entrada.nextDouble();

        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (numero1 + numero2));
                break;

            case 2:
                System.out.println("Resultado: " + (numero1 - numero2));
                break;

            case 3:
                System.out.println("Resultado: " + (numero1 * numero2));
                break;

            case 4:
                if (numero2 == 0) {
                    System.out.println("Erro: divisao por zero!");
                } else {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }
                break;

            default:
                System.out.println("Opcao invalida!");
        }

        entrada.close();
    }
}