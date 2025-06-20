/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class futurasActividades {
    private String fechaAct;
    private String presupuesto;
    private String lugarInteres;

    public futurasActividades(String fechaAct, String presupuesto, String lugarInteres) {
        this.fechaAct = fechaAct;
        this.presupuesto = presupuesto;
        this.lugarInteres = lugarInteres;
    }

    public String getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(String fechaAct) {
        this.fechaAct = fechaAct;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getLugarInteres() {
        return lugarInteres;
    }

    public void setLugarInteres(String lugarInteres) {
        this.lugarInteres = lugarInteres;
    }
    
    
}
