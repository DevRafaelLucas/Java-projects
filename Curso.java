public class Curso {

    /* Exercícios 13 OOP - Crie uma classe Curso com os atributos nome e duracao (em horas). 
    Utilize métodos getter e setter para manipular esses atributos. 
    No método main, defina os valores de nome e duracao, e depois exiba-os. */

    /* Atributos da classe */
    private String nome;
    private int duracao;

    /* Métodos getters/Setters para ver e modificar os atributos */

    // Método Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    // Método Getter
    public String getNome() {
        return nome;
    }
    public int getDuracao() {
        return duracao;
    }

    /* Método main para criar um objeto e definir os valores dos atributos */
    public static void main(String[] args) {

    /* Criando um objeto da classe definindo os valores dos atributos */
        Curso curso = new Curso();
        curso.setDuracao(12);
        curso.setNome("Java");
    
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Duração: " + curso.getDuracao());
        
    }
}
