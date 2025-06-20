/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author dominus
 */
public class Cafeteria {
    private String nombre_caf;
    private String tipo_caf;
    private String ubicacion;
    private String calificacion;

    public Cafeteria(String nombre_caf, String tipo_caf, String ubicacion, String calificacion) {
        this.nombre_caf = nombre_caf;
        this.tipo_caf = tipo_caf;
        this.ubicacion = ubicacion;
        this.calificacion = calificacion;
    }

    public String getNombre_caf() {
        return nombre_caf;
    }

    public void setNombre_caf(String nombre_caf) {
        this.nombre_caf = nombre_caf;
    }

    public String getTipo_caf() {
        return tipo_caf;
    }

    public void setTipo_caf(String tipo_caf) {
        this.tipo_caf = tipo_caf;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
    
}
