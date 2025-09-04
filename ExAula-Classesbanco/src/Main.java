public class Main {
    public static void main(String[] args) {
        // Cria uma conta
        ContaBancaria contaPessoalNubank = new ContaBancaria(
                "876543-9", "0001", 1500.00,
                "Danilo Mori Schuler", "123.456.789-00", "14/08/1995"
        );

        // Cria um cartão e associa à conta
        Cartao cartaoNubank = new Cartao("1111222233334444", "123", "12/26", contaPessoalNubank);

        // Adiciona o cartão à conta
        contaPessoalNubank.adicionarCartao(cartaoNubank);

        // Exemplo de saída
        System.out.println("Conta criada para: " + contaPessoalNubank.titular.nome);
        System.out.println("Número da conta: " + contaPessoalNubank.numeroConta);
        System.out.println("Cartão associado: " + contaPessoalNubank.cartoes[0].codigo);
    }
}