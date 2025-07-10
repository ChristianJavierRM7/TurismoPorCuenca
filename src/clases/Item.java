package clases;

public class Item {

    private String nombre;
    private String url; 

    public Item(String nombre, String url) {
        this.nombre = nombre;
        this.url = url;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url; 
    }

    @Override
    public String toString() {
        return nombre;
    }
}
