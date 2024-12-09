public class Cachorro {
    /* 
    
    Exercícios 20 OOP - Criar uma classe "Cachorro" com atributos para nome e métodos comeu, bebeu, latiu e lambeu. 
    Não esqueça do Encapsulamento e  exibir as informações. 

    Exemplos de exibição:
    - O cachorro comeu
    - O cachorro bebeu
    - O cachorro latiu
    - O cachorro Lambeu 

    */

    // Atributos da classe Cachorro
    private String nome;


    //Método Getter e Setter da classe
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    //Método(ação) da classe carro
    void comeu() {
        System.out.println("Comeu mundos ");
    }
    void bebeu() {
        System.out.println("Bebeu agua ");
    }
    void latiu() {
        System.out.println("Latiu forte ");
    }
    void lambeu() {
        System.out.println("lambeu bem ");
    }

    //Método principal
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Devoador de Mundos");

        System.out.println("Meu cachorroq " + cachorro.getNome() + ", ele:");

        // Objeto de atributo
        cachorro.comeu();
        cachorro.bebeu();
        cachorro.lambeu();
        cachorro.latiu();


    }
}

