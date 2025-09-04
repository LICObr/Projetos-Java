public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    //Criar getters e setters, garantindo que preco não pode ser negativo.

    public String getNome() {
        return this.nome;
    }
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        if(preco >=0) {
            this.preco = preco;
        }else{
            System.out.println("O preco nao pode ser negativo!");
        }
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
