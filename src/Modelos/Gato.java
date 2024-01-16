package Modelos;

public class Gato {
    String nome;
    int idade;
    String cor;

    public Gato(String nome, int idade,String cor){
        this.cor = cor;
        this.idade = idade;
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "nome: " + getNome() +"idade: "+ getIdade()+"cor: " + getCor();
    }
}
