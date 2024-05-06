package caioLojinha;

public class Produto {
    //atributos -> caracteristicas da classe, ou seja, o que vai identificar cada objeto da classe
    private String nome;
    private int quantidade;
    private double preco;

    //métodos -> comportamentos -> interações que o objetos dessa classe vão executar
    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this quantidade = quantidade;
        this.preco = preco;
    }

    //construtor que recebe os atributos mais essenciais caso não seja fornecido todos
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //métodos para acessar e troca o dado que está na informação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}