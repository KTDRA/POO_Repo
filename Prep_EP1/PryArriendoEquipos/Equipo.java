public abstract class Equipo implements Descontable {

    private String codigo;
    private String marca;
    private double valorDia;
    private boolean disponible;

    public Equipo(String codigo, String marca, double valorDia, boolean disponible) {
        this.codigo = codigo;
        this.marca = marca;
        setValorDia(valorDia);
        this.disponible = disponible;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public double getValorDia() {
        return valorDia;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setValorDia(double valorDia) {
        if (valorDia <= 0) {
            throw new IllegalArgumentException(
                    "El valor por día debe ser mayor que 0."
            );
        }
        this.valorDia = valorDia;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public abstract double calcularArriendo(int dias);

    @Override
    public double aplicarDescuento(int dias) {
        if (dias <= 0) {
            throw new IllegalArgumentException(
                    "La cantidad de días debe ser mayor que 0."
            );
        }

        double total = calcularArriendo(dias);

        if (dias >= 7) {
            total = total - (total * DESCUENTO_SEMANA);
        }

        return total;
    }

    @Override
    public String toString() {
        return "Código: " + codigo
                + " | Marca: " + marca
                + " | Valor día: $" + valorDia
                + " | Disponible: "
                + (disponible ? "Sí" : "No");
    }
}
