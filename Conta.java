public class Conta {
    private String titular;
    private int numeroID;
    private double saldo;

    // CONSTRUTOR
    public Conta(String titular, int numeroID, double saldo) {
        this.titular = titular;
        this.numeroID = numeroID;
        this.saldo = saldo;
    }

    // METODOS

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor inválido para depósito");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroID);
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }
}
