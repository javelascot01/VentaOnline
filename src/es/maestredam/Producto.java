package es.maestredam;

public class Producto {
    private String numero;
    private String descripcion;
    private double precio;
    public Producto(String numero, String descripcion,
                    double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }
}
