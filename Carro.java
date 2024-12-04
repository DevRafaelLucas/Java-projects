public class Carro {

    private String nome;

public void setNome(String nome) {
this.nome = nome; }

    public String getNome() {
        return nome;
    }

    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setNome("Camaro");

        System.out.println("Nome do carro é: " +
                carro.getNome());
    }
}
