//Primeiro projeo java, curso Alura

public class Main {
    public static void main(String[] args) {
        System.out.printf("Bem-vindo ao Screen Match!");
        System.out.println("Série: YOU");

        int anoDeLancamento = 2018;
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        boolean incluindoNoPlano = true;
        double notaDaSerie = 9.2;
        //Médias calculada pelas tres notas de telespectadores
        double media = (9.5 + 5.3 + 8.7) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Série YOU 
                Série sobre um homem aparente e encantador, mas psicopata, que se apaixona obsessivamente por mulheres
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);
    }
}



import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua série favorita: ");
        String serie = leitura.nextLine();
        System.out.println(serie);
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliação para a série ");
        double avaliacao = leitura.nextDouble();

        System.out.println(serie);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
