import java.util.ArrayList;

public class RegistroEquipos {

    private ArrayList<Equipo> equipos;

    public RegistroEquipos() {
        equipos = new ArrayList<>();
    }

    public boolean agregar(Equipo equipo) {
        for (Equipo e : equipos) {
            if (e.getCodigo().equalsIgnoreCase(equipo.getCodigo())) {
                System.out.println(
                        "ERROR: El código "
                                + equipo.getCodigo()
                                + " ya se encuentra registrado."
                );
                return false;
            }
        }

        equipos.add(equipo);
        return true;
    }

    public void listar() {
        if (equipos.isEmpty()) {
            System.out.println("No existen equipos registrados.");
            return;
        }

        System.out.println("\n=== LISTADO DE EQUIPOS ===");

        for (Equipo equipo : equipos) {
            System.out.println(equipo);
        }
    }

    public Equipo buscarPorCodigo(String codigo) {
        for (Equipo equipo : equipos) {
            if (equipo.getCodigo().equalsIgnoreCase(codigo)) {
                return equipo;
            }
        }

        return null;
    }

    public void filtrarPorMarca(String marca) {
        System.out.println(
                "\n=== EQUIPOS MARCA "
                        + marca.toUpperCase()
                        + " ==="
        );

        boolean encontrado = false;

        for (Equipo equipo : equipos) {
            if (equipo.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(equipo);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No existen equipos de esa marca.");
        }
    }

    public int contarDisponibles() {
        int contador = 0;

        for (Equipo equipo : equipos) {
            if (equipo.isDisponible()) {
                contador++;
            }
        }

        return contador;
    }

    public boolean eliminar(int indice) {
        try {
            Equipo eliminado = equipos.remove(indice);

            System.out.println(
                    "Equipo eliminado: "
                            + eliminado.getCodigo()
            );

            return true;

        } catch (IndexOutOfBoundsException e) {
            System.out.println(
                    "ERROR: El índice "
                            + indice
                            + " no existe."
            );

            return false;
        }
    }

    public int cantidad() {
        return equipos.size();
    }
}
