public class VideojuegoEstrategia extends Videojuego {
    private boolean tiempoReal;

    // CONSTRUCTOR

    public VideojuegoEstrategia(String titulo, int clasificacionEdad, double precioBase, boolean disponibleDescarga, boolean tiempoReal) {
        super(titulo, clasificacionEdad, precioBase, disponibleDescarga);
        this.tiempoReal = tiempoReal;
    }

    // GETTERS

    public boolean isTiempoReal() {
        return tiempoReal;
    }

    // SETTERS

    public void setTiempoReal(boolean tiempoReal) {
        this.tiempoReal = tiempoReal;
    }

    // METODO ABSTRACTO
    @Override
    public double calcularPrecioFinal() {
       double precio = getPrecioBase();
        if (isTiempoReal()){
            precio += precio * 0.15;
        }
        return precio;
    }

    // TO STRING

    @Override
    public String toString() {
        return super.toString();
    }
}
