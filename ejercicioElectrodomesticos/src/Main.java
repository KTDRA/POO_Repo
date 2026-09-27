import java.awt.event.TextEvent;

public class Main {
    public static void main(String[] args){
        Lavadora lavadora = new Lavadora(false,60,"SAMSUNG","IDC10500",140,14,70);
        Microondas microondas = new Microondas(false,12,"THOMAS","TH30M45",25,15,120);
        Televisor tv = new Televisor(false,10,"AOC","AO490C",12,44,7);

    System.out.println("=== PROBANDO POLIMORFISMO ===");
    Electrodomestico[] lista = { lavadora, microondas, tv };

        for (Electrodomestico e : lista) {
        e.encender();
        e.usar();
        System.out.println("----------------------------------");
        }

        System.out.println("\n=== ACCIONES ESPECÍFICAS E INTERFACES ===");
        lavadora.programar(30);
        lavadora.iniciarLavado();

        microondas.programar(5);
        microondas.calentar();

        tv.cambiarCanal(11);

        System.out.println("\n=== PRUEBAS DE VALIDACIÓN DE ERRORES ===");
        tv.cambiarCanal(-3);       // Canal inválido
        lavadora.programar(0);     // Minutos inválidos
    }
}