public abstract class Electrodomestico
    implements Encendible {
    private boolean encendido;
    private double peso;
    private String marca;
    private String num_serie;
    private int gasto_energetico;

    public Electrodomestico(boolean encendido, double peso, String marca, String num_serie, int gasto_energetico) {
        this.encendido = encendido;
        this.peso = peso;
        this.marca = marca;
        this.num_serie = num_serie;
        this.gasto_energetico = gasto_energetico;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public int getGasto_energetico() {
        return gasto_energetico;
    }

    public void setGasto_energetico(int gasto_energetico) {
        this.gasto_energetico = gasto_energetico;
    }
// RESOLVER BOOLEAN DE ENCENDIDO | PASAR A TOGGLE PARA RESOLVER EN UN SOLO METODO
    @Override
    public void encender() {
        setEncendido(true);
    }
    @Override
    public void apagar() {
        setEncendido(false);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "encendido=" + encendido +
                ", peso=" + peso +
                ", marca='" + marca + '\'' +
                ", num_serie='" + num_serie + '\'' +
                ", gasto_energetico=" + gasto_energetico +
                '}';
    }

    public abstract void usar();
}
