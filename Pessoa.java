public class Pessoa {
    
    // Atributo privado(não vai ter nenhuma interação com usuario ou classes)
    private String nome;

    /* Construtor */

    // Método Setter(Mudar o valor do atributo)
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Método Getter (Motrar valor de um atributo).
    public String getNome() {
        return nome;
    }

    // Método main
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Zezin");

        System.out.println("Nome da pessoa: " + pessoa.getNome());

    }
}
