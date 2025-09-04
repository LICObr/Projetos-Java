public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Leite", 2.45);

        produto.setPreco(12.5);
        System.out.println(produto.getNome() + ", Preco: R$ " +  produto.getPreco());
    }
}
