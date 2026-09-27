public class Main {
    static void main(String[] args) {
        GestorVideojuegos gestor = new GestorVideojuegos();
        Videojuego va1 = new VideojuegoAccion("Cyber Force", 16, 25000, true, true, 4);
        Videojuego va2 = new VideojuegoAccion("Shadow Fighter", 18, 25000, false, false, 5);
        Videojuego ve1 = new VideojuegoEstrategia("Cyber Force",12,20000,false,false);
        Videojuego ve2 = new VideojuegoEstrategia("Empire Wars",14,20000,false,true);

        System.out.println("\n === REGISTRO DE VIDEOJUEGOS ===");
        gestor.registrar(va1);
        gestor.registrar(va2);
        gestor.registrar(ve1);
        gestor.registrar(ve2);

        gestor.listar();

        System.out.println("\n=== BUSQUEDA POR TITULO ===");
        System.out.println(gestor.buscarPorTitulo("Cyber Force"));

        System.out.println("\n=== PRECIOS ===");
        System.out.println(va1.getTitulo() + " - $" + va1.calcularPrecioFinal() + " CLP");
        System.out.println(va2.getTitulo() + " - $" + va2.calcularPrecioFinal() + " CLP");
        System.out.println(ve1.getTitulo() + " - $" + ve1.calcularPrecioFinal() + " CLP");
        System.out.println(ve2.getTitulo() + " - $" + ve2.calcularPrecioFinal() + " CLP");

        System.out.println("\n=== DISPONIBILIDAD ===");
        System.out.println(va1.getTitulo() + " | disponible: " + va1.estaDisponibleDescarga());


                                                // VALIDACIONES

        System.out.println("\n=== VALIDACIONES ===");

        // ERROR 1
        try {
            Videojuego juegoError = new VideojuegoAccion(
                    "", 12, 15000, false, false, 3
            );
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        // ERROR 2
        try {
            Videojuego juegoError = new VideojuegoAccion(
                    "Minecraft", 25, 15000, false, false, 3
            );
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        // ERROR 3
        try {
            Videojuego juegoError = new VideojuegoAccion(
                    "Minecraft", 12, -15000, false, false, 3
            );
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        // ERROR 4
        try {
            Videojuego juegoError = new VideojuegoAccion(
                    "Minecraft", 12, 15000, false, false, 8
            );
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}