public class Notebook extends Equipo {

    private int ramGB;

    public Notebook(String codigo, String marca, double valorDia,
                    boolean disponible, int ramGB) {
        super(codigo, marca, valorDia, disponible);
        this.ramGB = ramGB;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }

    @Override
    public double calcularArriendo(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException(
                    "Los días deben ser mayores que 0."
            );
        }

        double total = getValorDia() * dias;

        if (ramGB >= 32) {
            total = total + (total * 0.10);
        }

        return total;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Notebook"
                + " | RAM: " + ramGB + " GB";
    }
}
