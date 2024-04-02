package es.maestredam;

import java.util.LinkedList;

public class Usuario {
    private String nombreUsuario;
    private java.util.LinkedList<Producto> listaProductos;
    private double precioTotal;

    public Usuario(String nombreUsuario){
        this.nombreUsuario=nombreUsuario;
        listaProductos= new LinkedList<>();
        precioTotal=0;
    }
    public void agregarProducto(Producto p){
        listaProductos.add(p);
    }
    public void eliminarProducto(String producto){
     listaProductos.removeIf(producto1 -> producto1.getDescripcion().contains(producto));
    }
    public void vaciarCesta(){
        listaProductos.clear();
    }
    public void comprarCesta(){
        System.out.println(getPrecioTotal());
    }
    public void verProductos(){
        if (listaProductos.isEmpty()){
            System.out.println("La cesta está vacia");
        }
        else {
            for (Producto p : listaProductos) {
                System.out.println(p.getDescripcion() + "   " + p.getPrecio() + "€");
            }
        }
    }
    public double getPrecioTotal(){
        precioTotal=0;
        for (Producto p : listaProductos){
            precioTotal=precioTotal+p.getPrecio();
        }
        return precioTotal;
    }
}
