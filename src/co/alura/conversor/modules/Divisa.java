package co.alura.conversor.modules;

public class Divisa {
    String nombre;
    double valor;

    public Divisa(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    //toString
    @Override
    public String toString() {
        return "Divisa{" +
                "nombre='" + nombre + '\'' +
                ", valor=" + valor +
                '}';
    }

    //getter and setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
