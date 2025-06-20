/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author RYZEN 7
 */
public class eventos {
  private String evtTipo;
private String evtFecha;
private String evtHoraInicio;
private String evtCover;

    public eventos(String evtTipo, String evtFecha, String evtHoraInicio, String evtCover) {
        this.evtTipo = evtTipo;
        this.evtFecha = evtFecha;
        this.evtHoraInicio = evtHoraInicio;
        this.evtCover = evtCover;
    }

    public eventos() {
    }

    public String getEvtTipo() {
        return evtTipo;
    }

    public void setEvtTipo(String evtTipo) {
        this.evtTipo = evtTipo;
    }

    public String getEvtFecha() {
        return evtFecha;
    }

    public void setEvtFecha(String evtFecha) {
        this.evtFecha = evtFecha;
    }

    public String getEvtHoraInicio() {
        return evtHoraInicio;
    }

    public void setEvtHoraInicio(String evtHoraInicio) {
        this.evtHoraInicio = evtHoraInicio;
    }

    public String getEvtCover() {
        return evtCover;
    }

    public void setEvtCover(String evtCover) {
        this.evtCover = evtCover;
    }


}
