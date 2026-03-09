//código de matris java
import java.util.Scanner; public class exercicos5 { public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String[] nomesCursos = {"Curso A", "Curso B", "Curso C", "Curso D", "Curso E"};
    String[] nomesUnidades = {"Unidade 1", "Unidade 2", "Unidade 3"};

    int[][] primeiroSemestre = new int[5][3];
    int[][] segundoSemestre = new int[5][3];
    int[][] totalAnual = new int[5][3];

    System.out.println("--- INSIRA AS MATRÍCULAS PARA O PRIMEIRO SEMESTRE: ");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("MATRÍCULAS DE " + nomesCursos[i] + " na " + nomesUnidades[j] + ": ");
            primeiroSemestre[i][j] = scanner.nextInt();
        }
    }
    System.out.println("\n INSIRA AS MATRÍCULAS PARA O SEGUNDO SEMESTRE: ");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print("MATRÍCULAS DE " + nomesCursos[i] + " na " + nomesUnidades[j] + ": ");
            segundoSemestre[i][j] = scanner.nextInt();
        }
    }
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            totalAnual[i][j] = primeiroSemestre[i][j] + segundoSemestre[i][j];
        }
    }
    System.out.println("\n MATRÍCULAS ANUAIS POR CURSO E UNIDADE:");
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.println(nomesCursos[i] + " na " + nomesUnidades[j] + ": " + totalAnual[i][j]);
        }
    }
    System.out.println("\n TOTAL DE MATRÍCULAS POR UNIDADE NO ANO:");
    for (int j = 0; j < 3; j++) {
        int totalPorUnidade = 0;
        for (int i = 0; i < 5; i++) {
            totalPorUnidade += totalAnual[i][j];
        }
        System.out.println(nomesUnidades[j] + ": " + totalPorUnidade);
    }
    System.out.println("\n TOTAL DE MATRÍCULAS POR CURSO NO ANO:");
    for (int i = 0; i < 5; i++) {
        int totalPorCurso = 0;
        for (int j = 0; j < 3; j++) {
            totalPorCurso += totalAnual[i][j];
        }
        System.out.println(nomesCursos[i] + ": " + totalPorCurso);
    }
    System.out.println("\n MAIOR NÚMERO DE MATRÍCULAS POR CUSO NO ANO:");
    for (int i = 0; i < 5; i++) {
        int maiorMatriculas = 0;
        int unidadeMaiorMatriculas = -1;
        for (int j = 0; j < 3; j++) {
            if (totalAnual[i][j] > maiorMatriculas) {
                maiorMatriculas = totalAnual[i][j];
                unidadeMaiorMatriculas = j;
            }
        }
        System.out.println(nomesCursos[i] + ": " + maiorMatriculas + " na " + nomesUnidades[unidadeMaiorMatriculas]);
    }
}
}
