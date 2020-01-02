package com.example.bellayelegantejoyeria;

public class Productos {
    private String nombre, descripcion, imagen;
    private int precio;

    public Productos(String nombre, String descripcion, String imagen,int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public float getPrecio() {
        return precio;
    }
}
