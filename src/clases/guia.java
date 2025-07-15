package clases;

public class guia {
    private String nombre;
    private int edad;
    private String experiencia;
    private String idiomas;
    private String especialidad;
    private String presentacion;

    public guia() {
    }

    public guia(String nombre, int edad, String experiencia, String idiomas, String especialidad, String presentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
        this.idiomas = idiomas;
        this.especialidad = especialidad;
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getPresentacion() {
        return presentacion;
    }

    
}
