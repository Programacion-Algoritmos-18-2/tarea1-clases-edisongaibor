
package ejercicio1;

public class Estudiantes {
    private String Nombre;
    private String Edad;

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    @Override
    public String toString() {
        return "{:" + "Nombre:" + Nombre + ", Edad:" + Edad + '}';
    }
    
}
