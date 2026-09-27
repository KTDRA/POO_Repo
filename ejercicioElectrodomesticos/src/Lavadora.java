public class Lavadora extends Electrodomestico implements Programable {
    private int capacidadKg;
    private int minutosLavado;

    public Lavadora(boolean encendido, double peso, String marca, String num_serie, int gasto_energetico, int capacidadKg, int minutosLavado) {
        super(encendido, peso, marca, num_serie, gasto_energetico);
        this.capacidadKg = capacidadKg;
        this.minutosLavado = minutosLavado;
    }

    public int getCapacidadKg() {
        return capacidadKg;
    }

    public void setCapacidadKg(int capacidadKg) {
        this.capacidadKg = capacidadKg;
    }

    public int getMinutosLavado() {
        return minutosLavado;
    }

    public void setMinutosLavado(int minutosLavado) {
        this.minutosLavado = minutosLavado;
    }
    @Override
    public void usar() {
        if (isEncendido()) {
            System.out.println("La lavadora " + getMarca() + " está lavando " + capacidadKg + " kg de ropa.");
        } else {
            System.out.println("No se puede usar la lavadora porque está apagada.");
        }
    }

    public void centrifugar() {
        if (isEncendido()) {
            System.out.println("Centrifugando la ropa a alta velocidad...");
        } else {
            System.out.println("Lavadora apagada, debe encenderse para centrifugar.");
        }
    }
    public void iniciarLavado() {
        if (isEncendido()) {
            System.out.println("Iniciando programa de lavado. Tiempo restante: " + this.minutosLavado + " minutos.");
        } else {
            System.out.println("Lavadora apagada, debe encenderse.");
        }
    }

    @Override
    public void programar(int minutos) {
        if (minutos <= 0){
            System.out.println("Error: los minutos a programar deben ser mayores a 0");
        } else {
            System.out.println("Lavadora programada para lavar en " + minutos + " minutos.");
        }
    }
}
