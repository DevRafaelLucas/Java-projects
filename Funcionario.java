public class Funcionario {

    /* Exercícios 14 OOP - Crie uma classe Funcionario com os atributos nome e salario. 
    Utilize métodos getter e setter para manipular esses atributos. 
    No método main, defina os valores de nome e salario, e depois exiba-os. */
    
    // Atributos da classe.
    private String nome;
    private int salario;

    // Métodos getters/Setters para ver e modificar os atributos.
    // Método Setter.
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Método Getter.
    public String getNome() {
        return nome;
    }
    public int getSalario() {
        return salario;
    }

    // Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {

        // Criando um objeto da classe definindo os valores dos atributos
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Rafael");
        funcionario.setSalario(10000000);

        // Exibindo os valores dos atributos do objeto
        System.out.println("Nome do funcionario: " + funcionario.getNome());
        System.out.println("Valor do salario: " + funcionario.getSalario());

    }
}
