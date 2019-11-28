package com.example.bellayelegantejoyeria;

public class Elementos {

    private String Codigo, Descripcion, Detalles;
    private double Precio;
    private String imagen;

    public Elementos(String codigo, String descripcion, String detalles, double precio, String imagen) {
        Codigo = codigo;
        Descripcion = descripcion;
        Detalles = detalles;
        Precio = precio;
        this.imagen = imagen;
    }

    public Elementos(String codigo, String descripcion, String detalles) {
        Codigo = codigo;
        Descripcion = descripcion;
        Detalles = detalles;
    }

    public Elementos(String descripcion, String detalles, double precio, String imagen) {
        Descripcion = descripcion;
        Detalles = detalles;
        Precio = precio;
        this.imagen = imagen;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String detalles) {
        Detalles = detalles;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Elementos{" +
                "Codigo='" + Codigo + '\'' +
                ", Descripcion='" + Descripcion + '\'' +
                ", Detalles='" + Detalles + '\'' +
                ", Precio=" + Precio +
                ", imagen='" + imagen + '\'' +
                '}';
    }
}

