package caioLojinha;
import java.util.ArrayList;

public class Estoque {
    //atributo
    private ArrayList<Produto> produtos;

    //método construtor
    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    //C - Create (Criar)
    //método que vai adicionar um produto
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    //R Read (Ler) -> exibir/listar
    public void listarProdutos() {
        if(produtos.isEmpty()) {
            System.out.println(x:"Não há produtos no estoque :(")
        } else {
            System.out.println(x:"Esses são os produtos em estoque: ")
            for (Produto produto : produtos) {
                System.out.println(x:"Nome: " + produto.getNome() + ", Quantidade: " + produto.getQuantidade() + ", Preço: " +produto.getPreco())
            }
        }
    }
    
    //U - Update (Atualização)
    public void atualizarProduto(String nome, int quantidade, double preco) {
        for(Produto produto : produtos) {
            if(produto.getNome().equals(nome)) {
                produto.setQuantidade(quantidade);
                produto.setPreco(preco);
                System.out.println("O produto " + produto.getNome() + "foi atualizado com sucesso!!");
            }
        }
        System.out.println(x:"Produto informado não existe no estoque :(");
    }

    //Possibilidade de atualização para apenas dois parametros
    public void atualizarProduto(String nome, double preco) {
        for(Produto produto : produtos) {
            if(produto.getNome().equals(nome)) {
                produto.setPreco(preco);
                System.out.println("O produto " + produto.getNome() + "foi atualizado com sucesso!!");
            }
        }
        System.out.println(x:"Produto informado não existe no estoque :(");
    }

    //D - Delete (Deletar)
    public void removerProduto(String nome) {
        for (int index = 0; index < produtos.size(); index ++) {
            Produto p = produtos.get(index);
            if (p.getNome().equals(nome)) {
                produtos.remove(index);
                System.out.println(x:"Produto removido com sucesso!!");
                return;
            }
        }
        System.out.println(x:"Produto informado não existe no estoque...");
    }

}

