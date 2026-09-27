public class VideojuegoAccion extends Videojuego{
    private boolean multijugadorOnline;
    private  int nivelViolencia;

    public VideojuegoAccion(String titulo, int clasificacionEdad, double precioBase, boolean disponibleDescarga, boolean multijugadorOnline, int nivelViolencia) {
        super(titulo, clasificacionEdad, precioBase, disponibleDescarga);
        this.multijugadorOnline = multijugadorOnline;
        setNivelViolencia(nivelViolencia);
    }

    // GETTERS
    public boolean isMultijugadorOnline() {
        return multijugadorOnline;
    }

    public int getNivelViolencia() {
        return nivelViolencia;
    }

    // SETTERS

    public void setMultijugadorOnline(boolean multijugadorOnline) {
        this.multijugadorOnline = multijugadorOnline;
    }

    public void setNivelViolencia(int nivelViolencia) {
        if (nivelViolencia < 1 || nivelViolencia > 5){
            throw new IllegalArgumentException("El rango aceptado es entre 1 y 5");
        }
        this.nivelViolencia = nivelViolencia;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = getPrecioBase();
        if (isMultijugadorOnline()){
           precio += precio * 0.2;
        }
        return precio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
