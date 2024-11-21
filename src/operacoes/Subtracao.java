package operacoes;
import java.util.Scanner;

public class Subtracao {
    public void calcularSubtracao() {
        System.out.println("Você escolheu Adição!\n" +
                "Então, vamos calcular!");
        calculo();
    }

    public void calculo(){
        Scanner x = new Scanner(System.in);

        System.out.println("Por favor, insira o primeiro valor:");
        double v1 = x.nextDouble();

        System.out.println("Agora, insira o seguno valor a ser subtraido:");
        double v2 = x.nextDouble();

        double resultado = v1 - v2;

        System.out.println("O resultado é: " + resultado);
    }
}
