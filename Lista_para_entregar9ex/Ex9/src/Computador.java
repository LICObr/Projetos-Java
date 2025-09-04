class Computador {
    private Processador processador;
    private MemoriaRAM memoriaRAM;
    private List<Periferico> perifericos;

    public Computador(Processador processador, MemoriaRAM memoriaRAM) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.perifericos = new ArrayList<>();
    }

    public void ligar() {
        System.out.println("Computador ligado com " + processador + " e " + memoriaRAM);
    }

    public void desligar() {
        System.out.println("Computador desligado.");
    }

    public void adicionarPeriferico(Periferico p) {
        perifericos.add(p);
        System.out.println("Periférico adicionado: " + p);
    }

    public void removerPeriferico(Periferico p) {
        perifericos.remove(p);
        System.out.println("Periférico removido: " + p);
    }

    public void listarPerifericos() {
        System.out.println("Periféricos conectados:");
        for (Periferico p : perifericos) {
            System.out.println(" - " + p);
        }
    }
}