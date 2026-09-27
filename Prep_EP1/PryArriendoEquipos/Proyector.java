public class Proyector extends Equipo {

    private int lumenes;

    public Proyector(String codigo, String marca, double valorDia,
                     boolean disponible, int lumenes) {
        super(codigo, marca, valorDia, disponible);
        this.lumenes = lumenes;
    }

    public int getLumenes() {
        return lumenes;
    }

    public void setLumenes(int lumenes) {
        this.lumenes = lumenes;
    }

    @Override
    public double calcularArriendo(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException(
                    "Los días deben ser mayores que 0."
            );
        }

        double total = getValorDia() * dias;

        if (lumenes >= 5000) {
            total = total + (total * 0.08);
        }

        return total;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Proyector"
                + " | Lúmenes: " + lumenes;
    }
}
