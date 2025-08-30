import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema bancário!");

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Deseja fazer um depósito inicial? (s/n): ");

        char resposta = scanner.next().charAt(0);

        double saldoInicial = 0;

        if (resposta == 's' || resposta == 'S') {
            System.out.println("Digite o valor do depósito inicial:");
            saldoInicial = scanner.nextDouble();
        }

        Conta conta = new Conta(titular, numero, saldoInicial);

        int opcao;

        do {

            System.out.println("\nMENU:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor a depositar: ");
                    int depositar = scanner.nextInt();

                    conta.depositar(depositar);
                    break;
                case 2:
                    System.out.println("Valor a sacar: ");
                    int sacar = scanner.nextInt();

                    conta.sacar(sacar);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 4);
        
        scanner.close();

        conta.exibirSaldo();
        
    }
}
