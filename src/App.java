import operacoes.Adicao;
import operacoes.Divisao;
import operacoes.Multiplicacao;
import operacoes.Subtracao;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        System.out.println("Olá! Seja bem-vindo.\n" +
                "Irei te ajudar com cálculos matemáticos simples.");
        while (continuar) {
            System.out.println(
                    "Por favor, digite o número correspondente ao tipo de operação que deseja realizar: \n" +
                    "1 - Adição \n" +
                    "2 - Subtração \n" +
                    "3 - Divisão \n" +
                    "4 - Multiplicação");

            int valorInserido = scanner.nextInt();

            switch (valorInserido) {
                case 1:
                    Adicao adicao = new Adicao();
                    adicao.calcularAdicao();
                    break;

                case 2:
                    Subtracao subtracao = new Subtracao();
                    subtracao.calcularSubtracao();
                    break;

                case 3:
                    Divisao divisao = new Divisao();
                    divisao.calcularDivisao();
                    break;

                case 4:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.calcularMultiplicacao();
                    break;

                default:
                    System.out.println("Opção Inválida! Tente novamente.");
            }

            System.out.println("Deseja realizar outra operação? (S/N)");
            scanner.nextLine();
            String reiniciar = scanner.nextLine().toUpperCase();
            if (!reiniciar.equals("S")) {
                continuar = false;
            }
        }

        System.out.println("Obrigado por usar o programa. Até a próxima!");
    }
}
