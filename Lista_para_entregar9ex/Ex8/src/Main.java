public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Maria", "123.456.789-00");

        Produto p1 = new Produto("Celular", 1500.00);
        Produto p2 = new Produto("Fone de Ouvido", 200.00);

        Pedido pedido = new Pedido(c1);
        pedido.adicionarProduto(p1);
        pedido.adicionarProduto(p2);

        pedido.mostrarDetalhes();
    }
}