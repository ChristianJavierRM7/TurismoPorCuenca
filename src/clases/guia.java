/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class guia {
    private String nombreGuia;
    private String expGuia;
    private String recomenGuia;
    private String calificacionGuia;

    public guia() {
    }

    public guia(String nombreGuia, String expGuia, String recomenGuia, String calificacionGuia) {
        this.nombreGuia = nombreGuia;
        this.expGuia = expGuia;
        this.recomenGuia = recomenGuia;
        this.calificacionGuia = calificacionGuia;
    }

    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public String getExpGuia() {
        return expGuia;
    }

    public void setExpGuia(String expGuia) {
        this.expGuia = expGuia;
    }

    public String getRecomenGuia() {
        return recomenGuia;
    }

    public void setRecomenGuia(String recomenGuia) {
        this.recomenGuia = recomenGuia;
    }

    public String getCalificacionGuia() {
        return calificacionGuia;
    }

    public void setCalificacionGuia(String calificacionGuia) {
        this.calificacionGuia = calificacionGuia;
    }
    
    
}
