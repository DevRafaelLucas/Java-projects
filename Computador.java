public class Computador {

    // Exercícios 09 OOP - Crie uma nova classe Computador com 4 atributos públicos do jeito que quiser, não esqueça de adicionar o método getter para esses atributos. 
    // No método main, crie um objeto "Computador" e exiba os valores desses atributos usando os getters.

    // Atributos da classe.
    public String marca;
    public String sistemaOperacional;
    public String CPU;
    public int memoriaRam;

    // Construtor da classe
    public Computador(String marca, String sistemaOperacional, String CPU, int memoriaRam) {
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
        this.CPU = CPU;
        this.memoriaRam = memoriaRam;
    }

    // Métodos getters para acessar os atributos
    public String getMarca() {
        return marca;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public String getCPU() {
        return CPU;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    // Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {

    // Criando um objeto da classe Computador e definindo os valores dos atributos
    Computador computador = new Computador("DELL", "Linux", "Ryzen", 32);

    // Exibindo os valores dos atributos do objeto
    System.out.println("Nome da marca: " + computador.getMarca());
    System.out.println("Nome do Sistema Operacional: " + computador.getSistemaOperacional());
    System.out.println("Nome da CPU: " + computador.getCPU());
    System.out.println("Nome da memoria ram " + computador.getMemoriaRam());
    }
}
