public class Nadador {

    // atributos
    public String nome;
    public int idade;

    // Construtor de Classe
    public Nadador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método Getter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método Main serve para executar o programa
    public static void main(String[] args) {
        // Criando objeto da classe nadador
        Nadador nadador = new Nadador("Rafael", 22);

        // Imprimindo os valores do usuário
        System.out.println("Nome: " + nadador.getNome());
        System.out.println("idade: " + nadador.getIdade());

    }
}
