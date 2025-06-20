package clases;

public class cls_mapa {
    private String recomendaciones;
    private int coordenadas;
    private String buscador;
    private String historial;
    private String historial_busquedas;
    private int opc_buscar;
    private String compartir;
    

    public cls_mapa() {
    }

    public cls_mapa(String recomendaciones, int coordenadas, String buscador, String historial, String historial_busquedas, int opc_buscar, String compartir) {
        this.recomendaciones = recomendaciones;
        this.coordenadas = coordenadas;
        this.buscador = buscador;
        this.historial = historial;
        this.historial_busquedas = historial_busquedas;
        this.opc_buscar = opc_buscar;
        this.compartir = compartir;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    public int getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getBuscador() {
        return buscador;
    }

    public void setBuscador(String buscador) {
        this.buscador = buscador;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }

    public String getHistorial_busquedas() {
        return historial_busquedas;
    }

    public void setHistorial_busquedas(String historial_busquedas) {
        this.historial_busquedas = historial_busquedas;
    }

    public int getOpc_buscar() {
        return opc_buscar;
    }

    public void setOpc_buscar(int opc_buscar) {
        this.opc_buscar = opc_buscar;
    }

    public String getCompartir() {
        return compartir;
    }

    public void setCompartir(String compartir) {
        this.compartir = compartir;
    }
    
    
}
