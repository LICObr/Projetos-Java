public class Livro {
    String titulo;
    String autor;
    private boolean disponivel;

    Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true; //todo livro comeca disponivel
    }
    public void emprestar(){
        if(disponivel == true){
            disponivel = false;
            System.out.println("Livro " + titulo + " foi emprestado!");
        }else{
            System.out.println("Livro " + titulo + " ja esta emprestado!");
        }
    }
    public void devolver(){
        if(disponivel == false){
            disponivel = true;
            System.out.println("Livro " + titulo + " foi devolvido!");
        }else{
            System.out.println("Livro " + titulo + " ja estava disponivel!");
        }
    }
    public boolean getDisponivel() {
        return disponivel;
    }
}
