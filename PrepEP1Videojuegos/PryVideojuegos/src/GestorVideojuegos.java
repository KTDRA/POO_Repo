import java.util.ArrayList;

public class GestorVideojuegos { //<----CLASE
    private ArrayList<Videojuego> videojuegos; // <---- ATRIBUTO

    public GestorVideojuegos(){ // <---- CONSTRUCTOR
        videojuegos = new ArrayList<>(); // <---- CREA LISTA VACIA
    }

    // METODOS
    public void registrar(Videojuego videojuego){
        videojuegos.add(videojuego);
        System.out.println("\nVideojuego " + videojuego.getTitulo() + " registrado con exito.");
    }

    public ArrayList<Videojuego> buscarPorTitulo(String titulo){
        ArrayList<Videojuego> resultados = new ArrayList<>();
        for (Videojuego videojuego: videojuegos){
            if(videojuego.getTitulo().equalsIgnoreCase(titulo)){
                resultados.add(videojuego);
            }
        }
        return resultados;
    }

    public void listar(){
        System.out.println("\n=== LISTA DE VIDEOJUEGOS ===");
        for (Videojuego videojuego:videojuegos){
            System.out.println(videojuego);
        }
        System.out.println("=== FIN DE LA LISTA ===");
    }
}
