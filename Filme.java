public class Filme {

    // Exercícios 10 OOP - Crie uma nova classe Filme com os atributos públicos que
    // contenha Titulo, Ator, Diretor
    // e escolha mais dois de sua escolha não esqueça de adicionar o método getter
    // para esses atributos.
    // No método main, crie um objeto "Filme" e exiba os valores desses atributos
    // usando os getters.

    // Atributos da classe
    public String nome;
    public String autor;
    public String diretor;
    public String produtor;
    public String designer;

    // Construtor da classe
    public Filme(String nome, String autor, String diretor, String produtor, String desinger, String designer) {
        this.nome = nome;
        this.autor = autor;
        this.diretor = diretor;
        this.produtor = produtor;
        this.designer = designer;
    }

    // Métodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public String getDesigner() {
        return designer;    
    }

    // Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {

    // Criando um objeto da classe Filme definindo os valores dos atributos
        Filme filme = new Filme("Rambo first blood", "David Morrell", "Ted Kotcheff", "Buzz Feitshans", "John Vallone", "null");

    // Exibindo os valores dos atributos do objeto
        System.out.println("Nome do filme: " + filme.getNome());
        System.out.println("Nome do autor: " + filme.getAutor());
        System.out.println("Nome do diretor: " + filme.getAutor());
        System.out.println("Nome do produtor: " + filme.getProdutor());
        System.out.println("Nome do designer: " + filme.getDesigner());
    }

}
