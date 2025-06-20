/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author dominus
 */
public class Restaurantes {
    private String nombre_res;
    private String tipo_comida;
    private String ubicacion_res;

    public Restaurantes(String nombre_res, String tipo_comida, String ubicacion_res) {
        this.nombre_res = nombre_res;
        this.tipo_comida = tipo_comida;
        this.ubicacion_res = ubicacion_res;
    }

    public String getNombre_res() {
        return nombre_res;
    }

    public void setNombre_res(String nombre_res) {
        this.nombre_res = nombre_res;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public String getUbicacion_res() {
        return ubicacion_res;
    }

    public void setUbicacion_res(String ubicacion_res) {
        this.ubicacion_res = ubicacion_res;
    }
    
    
}
