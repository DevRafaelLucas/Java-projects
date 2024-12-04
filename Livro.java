public class Livro {

    // Atributos
    public String livro;
    public String autor;

    public int paginas;
    public String bibliografia;

    // Construtor
    public Livro(String livro, String autor, int paginas, String bibliografia) {
        this.livro = livro;
        this.autor = autor;
        this.paginas = paginas;
        this.bibliografia = bibliografia;
    }

    //Método Getter
    public String getLivro() {
        return livro;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getBibliografia() {
        return bibliografia;
    }

    // Método main 
    public static void main(String[] args) {
        Livro livro = new Livro("A historia dos Jedi", "Dave Filoni", 200, "Os cavaleiros Jedi");

        System.out.println("Livro: " + livro.getLivro());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Paginas: " + livro.getPaginas());
        System.out.println("Bibliografia: " + livro.getBibliografia());
    }
}