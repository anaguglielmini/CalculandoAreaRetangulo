
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        var altura = scanner.nextInt();

        System.out.println("Digite a base do retângulo: ");
        var base = scanner.nextInt();

        var area = base * altura;

        System.out.printf("A área do retângulo é %s", area);
    }
}
