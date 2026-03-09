import java.util.Scanner;

public class exercicio3 {  // Certifique-se de que o nome do arquivo seja 'Exercicio3.java'

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar o número de pessoas assistindo a cada canal
        int audienciaCanal4 = 0, audienciaCanal5 = 0, audienciaCanal7 = 0, audienciaCanal12 = 0;
        int totalPessoas = 0;

        int canal, pessoas;

        // Laço de repetição para ler os dados até que o código 0 seja informado
        while (true) {
            System.out.print("Digite o número do canal (4, 5, 7, 12) ou 0 para encerrar: ");
            canal = scanner.nextInt();

            // Depuração: Imprime o valor do canal digitado
            System.out.println("Canal informado: " + canal);

            if (canal == 0) {
                break; // Finaliza a leitura dos dados
            }

            // Verifica se o canal é válido
            if (canal == 4 || canal == 5 || canal == 7 || canal == 12) {
                System.out.print("Digite o número de pessoas assistindo ao canal " + canal + ": ");
                pessoas = scanner.nextInt();

                // Atualiza a audiência e o total de pessoas
                if (canal == 4) {
                    audienciaCanal4 += pessoas;
                } else if (canal == 5) {
                    audienciaCanal5 += pessoas;
                } else if (canal == 7) {
                    audienciaCanal7 += pessoas;
                } else if (canal == 12) {   
                    audienciaCanal12 += pessoas;
                }
                totalPessoas += pessoas; // Soma as pessoas ao total
            } else {
                System.out.println("Canal inválido! Digite um número de canal válido.");
            }
        }

        // Cálculo das porcentagens de audiência
        double porcentagemCanal4 = totalPessoas > 0 ? (double) audienciaCanal4 / totalPessoas * 100 : 0;
        double porcentagemCanal5 = totalPessoas > 0 ? (double) audienciaCanal5 / totalPessoas * 100 : 0;
        double porcentagemCanal7 = totalPessoas > 0 ? (double) audienciaCanal7 / totalPessoas * 100 : 0;
        double porcentagemCanal12 = totalPessoas > 0 ? (double) audienciaCanal12 / totalPessoas * 100 : 0;

        // Exibe os resultados
        System.out.println("\nResultado da audiência:");
        System.out.println("Canal 4: " + audienciaCanal4 + " pessoas");
        System.out.println("Canal 5: " + audienciaCanal5 + " pessoas");
        System.out.println("Canal 7: " + audienciaCanal7 + " pessoas");
        System.out.println("Canal 12: " + audienciaCanal12 + " pessoas");
        System.out.println("Total de pessoas assistindo: " + totalPessoas);
        System.out.println("Porcentagem de audiência do Canal 4: " + String.format("%.2f", porcentagemCanal4) + "%");
        System.out.println("Porcentagem de audiência do Canal 5: " + String.format("%.2f", porcentagemCanal5) + "%");
        System.out.println("Porcentagem de audiência do Canal 7: " + String.format("%.2f", porcentagemCanal7) + "%");
        System.out.println("Porcentagem de audiência do Canal 12: " + String.format("%.2f", porcentagemCanal12) + "%");

        scanner.close(); // Fecha o scanner
    }
}
