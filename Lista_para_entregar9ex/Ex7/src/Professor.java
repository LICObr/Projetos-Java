class Professor {
    String nome;
    String cpf;
    Disciplina[] disciplinas = new Disciplina[10]; // máximo 10 disciplinas
    int contador = 0;

    Professor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Associa uma disciplina a esse professor
    void adicionarDisciplina(Disciplina d) {
        if (contador < disciplinas.length) {
            disciplinas[contador] = d;
            contador++;
        } else {
            System.out.println("Limite de disciplinas atingido!");
        }
    }

    void mostrarDisciplinas() {
        System.out.println("Professor: " + nome);
        System.out.println("Disciplinas lecionadas:");
        for (int i = 0; i < contador; i++) {
            System.out.println("- " + disciplinas[i].nome);
        }
    }
}