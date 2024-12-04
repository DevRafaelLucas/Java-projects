public class ContaBancaria {

    /* Exercícios 12 OOP - Crie uma classe ContaBancaria com os atributos numero e saldo. 
    Utilize métodos getter e setter para manipular esses atributos. 
    No método main, defina os valores de numero e saldo, e depois exiba-os. */

    // Atributos
    private double numero;
    private double saldo;

    // Método setter
    public void setNumero(double numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método Getter
    public double getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    // Método Main
    public static void main(String[] args) {
        ContaBancaria contabancaria = new ContaBancaria();
        contabancaria.setNumero(10);
        contabancaria.setSaldo(1000);

        System.out.println("Numero: " + contabancaria.getNumero());
        System.out.println("Saldo: " + contabancaria.getSaldo());

    }
}
