import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para contar os votos
        int votoCandidato1 = 0, votoCandidato2 = 0, votoCandidato3 = 0, votoCandidato4 = 0;
        int votoNulo = 0, votoBranco = 0, totalVotos = 0;

        int voto; // Variável para ler o código do voto

        // Laço de repetição para ler os votos até que o código 0 seja informado
        while (true) {
            System.out.print("Digite o código do voto (1-4 para candidatos, 5 para nulo, 6 para em branco, 0 para finalizar): ");
            voto = scanner.nextInt();

            if (voto == 0) {
                break; // Finaliza a leitura de votos
            }

            // Contabiliza os votos
            switch (voto) {
                case 1:
                    votoCandidato1++;
                    break;
                case 2:
                    votoCandidato2++;
                    break;
                case 3:
                    votoCandidato3++;
                    break;
                case 4:
                    votoCandidato4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                default:
                    System.out.println("Código inválido! Digite novamente.");
                    continue; // Se o código for inválido, repete o laço
            }

            totalVotos++; // Conta cada voto
        }

        // Cálculo das porcentagens
        double porcentagemNulo = totalVotos > 0 ? (double) votoNulo / totalVotos * 100 : 0;
        double porcentagemBranco = totalVotos > 0 ? (double) votoBranco / totalVotos * 100 : 0;

        // Exibe os resultados
        System.out.println("\nResultado da eleição:");
        System.out.println("Votos para o Candidato 1: " + votoCandidato1);
        System.out.println("Votos para o Candidato 2: " + votoCandidato2);
        System.out.println("Votos para o Candidato 3: " + votoCandidato3);
        System.out.println("Votos para o Candidato 4: " + votoCandidato4);
        System.out.println("Votos nulos: " + votoNulo);
        System.out.println("Votos em branco: " + votoBranco);
        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Porcentagem de votos nulos: " + String.format("%.2f", porcentagemNulo) + "%");
        System.out.println("Porcentagem de votos em branco: " + String.format("%.2f", porcentagemBranco) + "%");

        scanner.close(); // Fechar o scanner
    }
}
