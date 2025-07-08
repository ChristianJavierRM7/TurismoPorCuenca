package clases;

public class ReservarLugares {
    private String tipoLugar;
    private String nombreLugar;
    private String fechaVisita;

    public ReservarLugares(String tipoLugar, String nombreLugar, String fechaVisita) {
        this.tipoLugar = tipoLugar;
        this.nombreLugar = nombreLugar;
        this.fechaVisita = fechaVisita;
    }

    public ReservarLugares() {
    }

    public String getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(String fechaVisita) {
        this.fechaVisita = fechaVisita;
    }
    
}
