/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class rentaAccesorios {
    private String lugarVenta;
    private String tipoProducto;
    private String precios;
    private String calidadProducto;

    public rentaAccesorios() {
    }

    public rentaAccesorios(String lugarVenta, String tipoProducto, String precios, String calidadProducto) {
        this.lugarVenta = lugarVenta;
        this.tipoProducto = tipoProducto;
        this.precios = precios;
        this.calidadProducto = calidadProducto;
    }

    public String getLugarVenta() {
        return lugarVenta;
    }

    public void setLugarVenta(String lugarVenta) {
        this.lugarVenta = lugarVenta;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public String getPrecios() {
        return precios;
    }

    public void setPrecios(String precios) {
        this.precios = precios;
    }

    public String getCalidadProducto() {
        return calidadProducto;
    }

    public void setCalidadProducto(String calidadProducto) {
        this.calidadProducto = calidadProducto;
    }
    
    
}
