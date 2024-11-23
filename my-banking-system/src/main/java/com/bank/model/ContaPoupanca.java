// ContaPoupanca.java
public class ContaPoupanca extends Conta {

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na Conta Poupança.");
            return true;
        }
        return false;
    }
}
