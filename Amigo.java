public class Amigo {
    private String nombre,tipoamistad;
    private  int edad;
    public Amigo(String nombre,String tipoamistad,int edad){
        this.nombre = nombre;
        this.tipoamistad= tipoamistad;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoamistad() {
        return tipoamistad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoamistad(String tipoamistad) {
        this.tipoamistad = tipoamistad;
    }
}
