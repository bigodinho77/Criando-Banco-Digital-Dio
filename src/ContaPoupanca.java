public class ContaPoupanca extends Conta{

    //numero da conta incrementa 1 a cada conta que tem
    public static int SEQUENCIAL = 1;
    public ContaPoupanca(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
    public void imprimirExtrato(){
        System.out.println("extrato da conta poupança");
        super.imprimirInfos();
    }
}
