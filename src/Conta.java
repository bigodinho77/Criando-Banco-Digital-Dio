public abstract class Conta implements IConta{

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    protected int agencia;
    protected int numero;
    protected double saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor){
        saldo = saldo - valor;
    };
    public void transferir(double valor,Conta contadestino){
        //tirar o valor dessa conta
        this.sacar(valor);
        // adicionar o valor na outra conta
        contadestino.depositar(valor);

    };
    public void depositar(double valor){
        saldo = saldo + valor;
    };
    public void imprimirInfos(){
        System.out.println("imprimir extrato");
        System.out.println("agencia: " + this.agencia);
        System.out.println("conta: " + this.numero);
        System.out.println("saldo: " + this.saldo);
    }
}
