public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE ARRIENDO DE EQUIPOS ===");

        RegistroEquipos registro = new RegistroEquipos();

        Notebook notebook1 = new Notebook(
                "N001", "Lenovo", 25000, true, 16
        );

        Notebook notebook2 = new Notebook(
                "N002", "Dell", 35000, true, 32
        );

        Proyector proyector1 = new Proyector(
                "P001", "Epson", 30000, true, 4000
        );

        Proyector proyector2 = new Proyector(
                "P002", "Epson", 45000, false, 6000
        );

        registro.agregar(notebook1);
        registro.agregar(notebook2);
        registro.agregar(proyector1);
        registro.agregar(proyector2);

        registro.listar();

        System.out.println(
                "\nCantidad total: " + registro.cantidad()
        );

        System.out.println(
                "Equipos disponibles: "
                        + registro.contarDisponibles()
        );

        registro.filtrarPorMarca("Epson");

        System.out.println("\n=== BUSCAR EQUIPO N002 ===");

        Equipo encontrado = registro.buscarPorCodigo("N002");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Equipo no encontrado.");
        }

        System.out.println("\n=== CÁLCULOS DE ARRIENDO ===");

        System.out.println(
                "Notebook N001 - 3 días: $"
                        + notebook1.calcularArriendo(3)
        );

        System.out.println(
                "Notebook N002 - 3 días: $"
                        + notebook2.calcularArriendo(3)
        );

        System.out.println(
                "Proyector P001 - 3 días: $"
                        + proyector1.calcularArriendo(3)
        );

        System.out.println(
                "Proyector P002 - 3 días: $"
                        + proyector2.calcularArriendo(3)
        );

        System.out.println("\n=== ARRIENDO POR 7 DÍAS ===");

        System.out.println(
                "Notebook N002 sin descuento: $"
                        + notebook2.calcularArriendo(7)
        );

        System.out.println(
                "Notebook N002 con descuento: $"
                        + notebook2.aplicarDescuento(7)
        );

        System.out.println("\n=== PRUEBA CÓDIGO DUPLICADO ===");

        Notebook duplicado = new Notebook(
                "N001", "HP", 28000, true, 16
        );

        registro.agregar(duplicado);

        System.out.println("\n=== ELIMINAR ÍNDICE 1 ===");
        registro.eliminar(1);

        System.out.println("\n=== ELIMINAR ÍNDICE 20 ===");
        registro.eliminar(20);

        System.out.println("\n=== PRUEBA DÍAS INVÁLIDOS ===");

        try {
            double total = notebook1.calcularArriendo(-2);
            System.out.println(total);

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA VALOR DÍA INVÁLIDO ===");

        try {
            Notebook notebookInvalido = new Notebook(
                    "N010", "Asus", -20000, true, 16
            );

        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        System.out.println("\n=== PRUEBA CONVERSIÓN ===");

        String entrada = "siete";

        try {
            int dias = Integer.parseInt(entrada);
            System.out.println("Días: " + dias);

        } catch (NumberFormatException e) {
            System.out.println(
                    "ERROR: '" + entrada
                            + "' no corresponde a un número."
            );
        }

        System.out.println("\n=== ESTADO FINAL ===");

        registro.listar();

        System.out.println(
                "\nDisponibles: "
                        + registro.contarDisponibles()
        );
    }
}
