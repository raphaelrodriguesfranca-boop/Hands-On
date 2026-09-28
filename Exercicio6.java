import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = entrada.nextDouble();

        System.out.println("1 - Comum");
        System.out.println("2 - Premium");
        System.out.println("3 - Funcionário");

        System.out.print("Digite a categoria: ");
        int categoria = entrada.nextInt();

        double desconto = 0;

        if (categoria == 1) {
            desconto = 0.05;
        } else if (categoria == 2) {
            desconto = 0.10;
        } else if (categoria == 3) {
            desconto = 0.15;
        } else {
            System.out.println("Categoria inválida");
            entrada.close();
            return;
        }

        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        System.out.println("Desconto: R$ " + valorDesconto);
        System.out.println("Valor final: R$ " + valorFinal);

        entrada.close();
    }
}