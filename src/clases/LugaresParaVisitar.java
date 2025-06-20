/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author dominus
 */
public class LugaresParaVisitar {
    private String nombrelugar;
    private String descripcion;
    private String ubicacion;
    private String calificacion;

    public LugaresParaVisitar(String nombrelugar, String descripcion, String ubicacion, String calificacion) {
        this.nombrelugar = nombrelugar;
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.calificacion = calificacion;
    }

    public String getNombrelugar() {
        return nombrelugar;
    }

    public void setNombrelugar(String nombrelugar) {
        this.nombrelugar = nombrelugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
