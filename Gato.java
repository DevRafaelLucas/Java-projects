public class Gato { /* 

    Exercícios 21 OOP - Criar uma classe "Gato" com atributos para nome e métodos comeu bebeu e miou. 
    Não esqueça do Encapsulamento e  exibir as informações. 

    Exemplos de exibição:
    - O Gato comeu
    - O Gato bebeu
    - O Gato miou 

    */

    // Atributos da classe
    public String nome;

    //Método getter e setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Construtor
    public Gato(String nome) {
        this.nome = nome;
    }

    //Métodos
    void comeu() {
        System.out.println("Comeu ração ");
    }
    void bebeu() {
        System.out.println("bebeu agua ");
    }
    void miou() {
        System.out.println("Miou bem ");
    }

    //Método main
    public static void main(String[] args) {
        Gato gato = new Gato("Tom");

        System.out.println("O gato " + gato.getNome());
        System.out.println("Ele: ");

        // Objeto de um atributo
        gato.comeu();
        gato.bebeu();
        gato.miou();
    }
}
