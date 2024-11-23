import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class VerificacaoSaldoAspect {

    // Pointcut que seleciona todos os métodos 'sacar' nas classes de Conta
    @Pointcut("execution(* Conta.sacar(..)) && args(valor)")
    public void metodoSacar(double valor) {}

    // Advice que executa antes do método 'sacar' para verificar o saldo
    @Before("metodoSacar(valor)")
    public void verificarSaldo(double valor) {
        // Acessamos o contexto da execução (a instância da conta)
        Conta conta = (Conta) org.aspectj.lang.reflect.MethodSignature.class.cast(
            org.aspectj.lang.JoinPoint.getSignature()).getDeclaringType();
        
        if (conta.getSaldo() < valor) {
            System.out.println("Erro: Saldo insuficiente para o saque de R$ " + valor);
        }
    }
}
