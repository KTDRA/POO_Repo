public abstract class Videojuego implements Descargable {
    private String titulo;
    private int clasificacionEdad;
    private double precioBase;
    private boolean disponibleDescarga;

    // CONSTRUCTOR
    public Videojuego(String titulo, int clasificacionEdad, double precioBase, boolean disponibleDescarga) {
        setTitulo(titulo);
        setClasificacionEdad(clasificacionEdad);
        setPrecioBase(precioBase);
        this.disponibleDescarga = disponibleDescarga;
    }

    // GETTERS
    public String getTitulo() {
        return titulo;
    }

    public int getClasificacionEdad() {
        return clasificacionEdad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public boolean isDisponibleDescarga() {
        return disponibleDescarga;
    }

    // SETTERS

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isBlank()) {
            throw new IllegalArgumentException("El titulo no puede ser null ni estar vacio");
        }
        this.titulo = titulo;
    }

    public void setClasificacionEdad(int clasificacionEdad) {
        if (clasificacionEdad < 3 || clasificacionEdad > 18) {
            throw new IllegalArgumentException("La clasificacion debe estar entre 3 y 18.");
        }
        this.clasificacionEdad = clasificacionEdad;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase <= 0) {
            throw new IllegalArgumentException("El precio base debe ser mayor que 0.");
        }
        this.precioBase = precioBase;
    }

    public void setDisponibleDescarga(boolean disponibleDescarga) {
        this.disponibleDescarga = disponibleDescarga;
    }

    // TOSTRING

    @Override
    public String toString() {
        return "\nTitulo: '" + titulo + '\'' + "| clasificacion: " + clasificacionEdad;
    }

    public abstract double calcularPrecioFinal();

    @Override
    public boolean estaDisponibleDescarga() {
        return isDisponibleDescarga();
    }

    @Override
    public void habilitarDescarga() {
        disponibleDescarga = true;
    }
}
