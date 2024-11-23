public class TesteSistemaBancario {

    public static void main(String[] args) {
        Conta corrente = new ContaCorrente(1000);
        Conta poupanca = new ContaPoupanca(500);

        // Tentativa de saque com saldo suficiente
        corrente.sacar(200);  // Saque realizado
        poupanca.sacar(300);  // Saque realizado

        // Tentativa de saque com saldo insuficiente
        corrente.sacar(1500);  // Erro: Saldo insuficiente
        poupanca.sacar(600);   // Erro: Saldo insuficiente
    }
}
