import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double saldo = 1000.00;
        int opcao;

        do {
            System.out.println("\n=== CAIXA ELETRONICO ===");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Ver saldo");
            System.out.println("4 - Sair");

            System.out.print("Escolha uma opcao: ");
            opcao = entrada.nextInt();if (opcao == 1) {
    System.out.print("Digite o valor do deposito: ");
    double valor = entrada.nextDouble();

    if (valor > 0) {
        saldo = saldo + valor;
        System.out.println("Deposito realizado!");
    } else {
        System.out.println("Valor invalido.");
    }
}if (opcao == 2) {
    System.out.print("Digite o valor do saque: ");
    double valor = entrada.nextDouble();

    if (valor > 0 && valor <= saldo) {
        saldo = saldo - valor;
        System.out.println("Saque realizado!");
    } else {
        System.out.println("Saque invalido.");
    }
}if (opcao == 3) {
    System.out.println("Saldo atual: R$ " + saldo);
}

        } while (opcao != 4);

        System.out.println("Saldo final: R$" + saldo);
        System.out.println("Programa encerrado.");

        entrada.close();
    }
}