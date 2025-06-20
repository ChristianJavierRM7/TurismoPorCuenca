/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class transporte {
    private String tpTomar;
    private String tpHorarios;
    private String tpRuta;

    public transporte() {
    }

    public transporte(String tpTomar, String tpHorarios, String tpRuta) {
        this.tpTomar = tpTomar;
        this.tpHorarios = tpHorarios;
        this.tpRuta = tpRuta;
    }

    public String getTpTomar() {
        return tpTomar;
    }

    public void setTpTomar(String tpTomar) {
        this.tpTomar = tpTomar;
    }

    public String getTpHorarios() {
        return tpHorarios;
    }

    public void setTpHorarios(String tpHorarios) {
        this.tpHorarios = tpHorarios;
    }

    public String getTpRuta() {
        return tpRuta;
    }

    public void setTpRuta(String tpRuta) {
        this.tpRuta = tpRuta;
    }
    
    
}
