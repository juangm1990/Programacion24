package SegundoTrimestre.Examenes.BolaExtra_ArchivosBinarios;

import java.io.Serializable;

public class Participantes implements Serializable {

String id;
String nombre;
String email;
public Participantes(String id, String nombre, String email) {
    this.id = id;
    this.nombre = nombre;
    this.email = email;
}
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
@Override
public String toString() {
    return id + " "  + nombre + " "  + email;
}

}
