/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class sitiosCercanos {
    private String ubicacion;
    private String tipoSitio;
    private String preciosSitio;
    private String naturalezaSitio;

    public sitiosCercanos() {
    }

    public sitiosCercanos(String ubicacion, String tipoSitio, String preciosSitio, String naturalezaSitio) {
        this.ubicacion = ubicacion;
        this.tipoSitio = tipoSitio;
        this.preciosSitio = preciosSitio;
        this.naturalezaSitio = naturalezaSitio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoSitio() {
        return tipoSitio;
    }

    public void setTipoSitio(String tipoSitio) {
        this.tipoSitio = tipoSitio;
    }

    public String getPreciosSitio() {
        return preciosSitio;
    }

    public void setPreciosSitio(String preciosSitio) {
        this.preciosSitio = preciosSitio;
    }

    public String getNaturalezaSitio() {
        return naturalezaSitio;
    }

    public void setNaturalezaSitio(String naturalezaSitio) {
        this.naturalezaSitio = naturalezaSitio;
    }
    
    
}
