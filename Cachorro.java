public class Cachorro {

    /* Exercícios 20 OOP - Criar uma classe "Cachorro" com atributos para nome e métodos comeu, bebeu, latiu e lambeu. 
    Não esqueça do Encapsulamento e  exibir as informações. 

    Exemplos de exibição:
    - O cachorro comeu
    - O cachorro bebeu
    - O cachorro latiu
    - O cachorro Lambeu 

    */

    // Atributos da classe Cachorro
    private String nome;
    private String comeu;
    private String bebeu;
    private String latiu;
    private String lambeu;

    //Construtor
    public Cachorro(String nome, String comeu, String bebeu, String latiu, String lambeu) {
        this.nome = nome;
        this.comeu = comeu;
        this.bebeu = bebeu;
        this.latiu = latiu;
        this.lambeu = lambeu;
    }

    //Método getter e setter para ver e modificar os atributos

    //Método getter
    public String getNome() {
        return nome;
    }
    public String getComeu() {
        return comeu;
    }
    public String getBebeu() {
        return bebeu;
    }
    public String getLatiu() {
        return latiu;
    }
    public String getLambeu() {
        return lambeu;
    }

    //Método setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setComeu(String comeu) {
        this.comeu = comeu;
    }
    public void setBebeu(String bebeu) {
        this.bebeu = bebeu;
    }
    public void setLatiu(String latiu) {
        this.latiu = latiu;
    }
    public void setLambeu(String lambeu) {
        this.lambeu = lambeu;
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Devorador de mundos", "Mundos", "agua", "forte", "bem");

        System.out.println("O cachorro " + cachorro.getNome() + " comeu " + cachorro.getComeu());
        System.out.println("O cachorro " + cachorro.getNome() + " bebeu " + cachorro.getBebeu());
        System.out.println("O cachorro " + cachorro.getNome() + " latiu " + cachorro.getLatiu());
        System.out.println("O cachorro " + cachorro.getNome() + " lambeu " + cachorro.getLambeu());
    }
    
}
