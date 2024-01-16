public class ContaCorrente extends Conta{
    //numero da conta incrementa 1 a cada conta que tem
    public static int SEQUENCIAL = 1;
    public ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
    public void imprimirExtrato(){
        System.out.println("extrato da conta corrente");
        super.imprimirInfos();
    }
}
