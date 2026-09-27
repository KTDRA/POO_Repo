public class Televisor extends Electrodomestico {
private int pulgadas;
private int canalActual;

    public Televisor(boolean encendido, double peso, String marca, String num_serie, int gasto_energetico, int pulgadas, int canalActual) {
        super(encendido, peso, marca, num_serie, gasto_energetico);
        this.pulgadas = pulgadas;
        this.canalActual = canalActual;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getCanalActual() {
        return canalActual;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }

    @Override
    public void usar() {
        if (isEncendido()){
            System.out.println("Televisor " + getMarca() + " encendido. Tamaño pantalla: " + getPulgadas() + " pulgadas.");
        } else {
            System.out.println("El televisor está apagado, debe encenderse.");
        }
    }
    public void cambiarCanal(int nuevoCanal) {
    if (!isEncendido()){
        System.out.println("El televisor está apagado, debe encenderse.");
    } else if (nuevoCanal <= 0) {
        System.out.println("Error: el número de canal debe ser mayor a 0.");
        } else {
        System.out.println("Cambiando canal de " + canalActual + " a " + nuevoCanal + ".");
        this.canalActual = nuevoCanal;
    }
    }
}
