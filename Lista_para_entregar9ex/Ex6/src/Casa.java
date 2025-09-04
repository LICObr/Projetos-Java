class Casa {
    String endereco;
    Comodo[] comodos; // array de cômodos
    int quantidadeComodos;

    // Construtor
    Casa(String endereco, Comodo[] comodos) {
        this.endereco = endereco;
        this.comodos = comodos;
        this.quantidadeComodos = comodos.length;
    }

    void mostrarComodos() {
        System.out.println("Casa localizada em: " + endereco);
        System.out.println("Cômodos da casa:");
        for (int i = 0; i < quantidadeComodos; i++) {
            System.out.println("- " + comodos[i].nome);
        }
    }
}
