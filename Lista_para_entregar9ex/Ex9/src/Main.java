public class Main {
    public static void main(String[] args) {
        Processador proc = new Processador("Intel i7", 3.8);
        MemoriaRAM ram = new MemoriaRAM(16);
        Computador pc = new Computador(proc, ram);

        pc.ligar();

        Periferico mouse = new Periferico("Mouse", "Logitech");
        Periferico teclado = new Periferico("Teclado", "Dell");
        Periferico monitor = new Periferico("Monitor", "Samsung");

        pc.adicionarPeriferico(mouse);
        pc.adicionarPeriferico(teclado);
        pc.adicionarPeriferico(monitor);

        pc.listarPerifericos();

        pc.removerPeriferico(teclado);
        pc.listarPerifericos();

        pc.desligar();
    }
}