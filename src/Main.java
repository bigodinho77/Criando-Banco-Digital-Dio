import java.util.*;
public class Main {
    public static void main(String[] args) {
        ContaCorrente contacorrente = new ContaCorrente();
        contacorrente.depositar(10);
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.depositar(20);
        contacorrente.transferir(5,contaPoupanca);
        contacorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        }
    }