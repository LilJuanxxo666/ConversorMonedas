package co.alura.conversor.modules;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Historial {
    private String historia;
    private LocalDateTime fecha;

    public Historial(String historia) {
        setHistoria(historia);
        setFecha();
    }

    //setter and getter
    public String getHistoria() {
        return historia;
    }
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = LocalDateTime.now();
    }

    //toString
    @Override
    public String toString() {
        return historia + " [" + fecha.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "]";
    }
}
