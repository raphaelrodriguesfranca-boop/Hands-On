import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota;

        System.out.print("Digite uma nota entre 0 e 100: ");
        nota = entrada.nextDouble();while (nota < 0 || nota > 100) {
    System.out.print("Nota invalida. Digite novamente: ");
    nota = entrada.nextDouble();
}

System.out.println("Nota valida: " + nota);

entrada.close();

    }
}