public interface Encendible {

    int VOLTAJE_DOMESTICO = 220;
    String ESTADO_ENCENDIDO = "ENCENDIDO";
    String ESTADO_APAGADO = "APAGADO";

    public void encender();
    void apagar();

}
