public class Cidade {
    // Exercícios 11 OOP - Crie uma classe Cidade com os atributos nome e população. 
    // Utilize métodos getter e setter para manipular esses atributos. 
    // No método main, defina os valores de nome e população, e depois exiba-os

    // Atributos da classe.
    private String nome;
    private Double populacao;

    // Método Setter.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    // Método Getter
    public String getNome() {
        return nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    // Método main
    public static void main(String[] args) {
        Cidade cidade = new Cidade();
        cidade.setNome("Brasilia");
        cidade.setPopulacao(4.935270);

        System.out.println("Nome da cidade é: " + cidade.getNome());
        System.out.println("Numero de habitantes: " + cidade.getPopulacao());
    }
}
