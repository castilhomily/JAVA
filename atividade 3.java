import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = scanner.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("A área do quadrado é: " + areaQuadrado);
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    double areaCirculo = Math.PI * raio * raio;
                    System.out.println("A área do círculo é: " + areaCirculo);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
