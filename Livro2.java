public class Livro2 {
    
    //Atributos da classe
    public String titulo;
    public int numeroPaginas;

    //Construtor
    public Livro2(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    //Método getter e setter para ver e modificar os atributos
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método main
        public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;

        if(numeroPaginas <= 10) {
            System.out.println("Esse livro tem poucas paginas");
        } else {
            System.out.println("Nome do livro: " + getTitulo());
            System.out.println("Numero de paginas: " + getNumeroPaginas());
            System.out.println("Esse livro tem um bom numero de paginas"); 
        }
    }

    //Estrutura condicional
    public static void main(String[] args) {
        Livro2 livro = new Livro2("O terro do java", 100);

        livro.setTitulo("O terro do java");
        livro.setNumeroPaginas(100);
    }

}

