public class Microondas extends Electrodomestico implements Programable {
    private int capacidadLitros;
    private int segundosCalentamiento;

    public Microondas(boolean encendido, double peso, String marca, String num_serie, int gasto_energetico, int capacidadLitros, int segundosCalentamiento) {
        super(encendido, peso, marca, num_serie, gasto_energetico);
        this.capacidadLitros = capacidadLitros;
        this.segundosCalentamiento = segundosCalentamiento;
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public int getSegundosCalentamiento() {
        return segundosCalentamiento;
    }

    public void setSegundosCalentamiento(int segundosCalentamiento) {
        this.segundosCalentamiento = segundosCalentamiento;
    }

    @Override
    public String toString() {
        return "Microondas{" +
                "capacidadLitros=" + capacidadLitros +
                ", segundosCalentamiento=" + segundosCalentamiento +
                '}';
    }

    @Override
    public void usar() {
        if (isEncendido()){
            System.out.println("Microondas " + getMarca() + " encendido. Capacidad: " + getCapacidadLitros() + " litros.");
        } else {
            System.out.println("El microondas está apagado, debe encenderse.");
        }

    }

    @Override
    public void programar(int minutos) {
        if (minutos <= 0){
            System.out.println("Error: los minutos a programar deben ser mayores a 0");
        } else {
            System.out.println("Microondas programado para operar en: "  + minutos + " minutos.");
        }
    }
    public void calentar() {
        if (isEncendido()) {
            System.out.println("Iniciando calentado...");
        } else {
            System.out.println("El microondas está apagado, debe encenderse.");
        }
    }
    public void descongelar() {
            if (isEncendido()){
                System.out.println("Iniciando descongelado...");
            } else {
                System.out.println("El microondas está apagado, debe encenderse.");
            }
        }
}
