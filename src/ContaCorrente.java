import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {

    double saldo;
    int numeroConta;
    int numeroAgencia;
    boolean ativa=true;

    Cliente cliente;

    void sacar(double valor){}
    void transferir(ContaCorrente contaDestino, Double valor){}

    Double consultarSaldo(){ return 0.0;}

    void cancelarConta(String justificativa){}

    List consultaExtrato(LocalDate dataInicio, LocalDate dataFim){return null;}
}
