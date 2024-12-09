public class Produto2 {

    /*
     * Exercícios 17 OOP - Crie uma classe chamada Produto com atributos para nome e
     * quantidade em estoque,
     * garantindo que a quantidade em estoque não seja negativa.
     */

    // Atributos da classe
    private String nome;
    private int quantidade;

    // Construtor
    public Produto2(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Método Getter
    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Método Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;

        if (quantidade < 0) {
            System.out.println("Numero de quantidade invalida, tente novamente");
        } else {
            // Exibindo os valores
            System.out.println("Nome do produto: " + getNome());
            System.out.println("Quantidade: " + getQuantidade());
        }
    }

    // Método main
    public static void main(String[] args) {
        Produto2 produto = new Produto2("Ketchup", 15);
        produto.setNome("Ketchup");
        produto.setQuantidade(-15);

    } 
}
