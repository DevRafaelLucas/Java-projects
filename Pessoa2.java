public class Pessoa2 {
    
    /* Exercícios 15 OOP - Crie uma classe chamada Pessoa com atributos para nome e
     * Idade, garantindo que a idade não seja negativa.
     * Obs: Use o (if e else). */

    // Atributos da classe.
    public String nome;
    public int idade;

    // Métodos getters/Setters para ver e modificar os atributos.
    
    // Método Getter.
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    // Método Setter.
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {

        // Criando um objeto da classe definindo os valores dos atributos
        Pessoa2 pessoa2 = new Pessoa2();
        pessoa2.setNome("Joãozinho");
        pessoa2.setIdade(19);

        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("Idade: " + pessoa2.getIdade());
    }

    // Método if e else
    public void setIdade(int idade) {
        this.idade = idade;

        if (idade < 1) {
            System.out.println("erro tente novamente");
        } 
        else if (idade < 18 && idade > 0) {
            System.out.println("Você ainda pode pensar na vida");
        }
        else {
            System.out.println("Você já pode ser preso :D");
        }
    }
}
