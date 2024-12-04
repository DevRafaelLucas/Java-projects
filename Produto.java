public class Produto {

    // Atributos
    public String nome;
    public float preco;
    public int quantidade;

    // Construtor
    public Produto(String nome, float preco, int quantidade) {

        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método Getter
    public String getNome(){
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método main
    public static void main(String[] args) {
        Produto produto = new Produto("CoquinhaGelada", 10, 10);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco() + " reais");
        System.out.println("Quantidade: " + produto.getQuantidade());
    }

}