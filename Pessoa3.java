public class Pessoa3 {

    /*
     * Exercícios 16 OOP - Crie uma classe em Java chamada "SeuNome"
     * com uma variedade de atributos, como nome, idade, profissão, endereço,
     * telefone, email, se possui carro, e salário.
     * Para cada atributo, inclua métodos para acessar (getters) e modificar
     * (setters) os valores.
     * No método main, crie uma instância dessa classe, defina valores para seus
     * atributos, e exiba esses valores na saída padrão.
     * Sinta-se à vontade para incluir quaisquer atributos adicionais que considere
     * relevantes.
     */

    // Atributos da classe
    public String nome;
    public int idade;
    public String profissao;
    public String endereco;
    public String telefone;
    public String email;
    public String carro;
    public int salario;

    // Métodos getters/Setters para ver e modificar os atributos
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getProfissao() {
        return profissao;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getCarro() {
        return carro;
    }
    public int getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCarro(String carro) {
        this.carro = carro;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    //Método main para criar um objeto e definir os valores dos atributos
    public static void main(String[] args) {
        //Criando um objeto da classe definindo os valores dos atributos
        Pessoa3 gabriel = new Pessoa3();
        gabriel.setNome("Gabriel");
        gabriel.setIdade(18);
        gabriel.setProfissao("Programa");
        gabriel.setEndereco("Quadra 22, Batcaverna");
        gabriel.setTelefone("(57) 99221-7889");
        gabriel.setEmail("cavernão123@gmail.com");
        gabriel.setCarro("Fiat Uno");
        gabriel.setSalario(1000000000);

        // Exibindo os valores dos atributos do objeto
        System.out.println("Nome: " + gabriel.getNome());
        System.out.println("Idade: " + gabriel.getIdade());
        System.out.println("Profissão: " + gabriel.getProfissao());
        System.out.println("Endereço: " + gabriel.getEndereco());
        System.out.println("Telefone: " + gabriel.getTelefone());
        System.out.println("Email: " + gabriel.getEmail());
        System.out.println("Carro: " + gabriel.getCarro());
        System.out.println("Salario: " + gabriel.getSalario());
    }
}
