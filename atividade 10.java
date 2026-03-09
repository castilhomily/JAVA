import java.util.Scanner;

public class ContaBancaria {

    private String nomeCliente;
    private String tipoConta;
    private double saldo;

    public ContaBancaria(String nomeCliente, String tipoConta, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }

    public void exibirDadosCliente() {
        System.out.println("*****************************************");
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("*****************************************");
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.%n", valor);
            System.out.printf("Novo saldo: R$ %.2f%n", saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.printf("Saque de R$ %.2f realizado com sucesso.%n", valor);
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            } else {
                System.out.println("Saldo insuficiente para realizar o saque.");
            }
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("Seu saldo atual é: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco!");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o tipo da conta (Corrente/Poupança): ");
        String tipo = scanner.nextLine();
        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(nome, tipo, saldoInicial);
        conta.exibirDadosCliente();

        int opcao;

        do {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.consultarSaldo();
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
