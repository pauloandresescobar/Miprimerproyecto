package pauloescobar.com.co.miprimerproyecto.DTO;

import java.io.Serializable;

/**
 * Created by usuario on 21/02/18.
 */

public class PersonaDTO implements Serializable {//hay que extender de la interfaz serializable
                                                // para poder pasarlo como parametro
    String nombre;
    String apellido;
    Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}

