package TercerTrimestre.Recuperacion.PruebaPractica5B;

public class Password {
    // Atributo privado que guarda la contraseña
    private String contrasena;

    // Constructor por defecto: asigna una contraseña fuerte fija
    public Password() {
        this.contrasena = "AAaa11._"; 
    }

    // Constructor con parámetro: si es fuerte, la usa. Si no, pone la por defecto
    public Password(String contrasena) {
        if (esFuerte(contrasena)) {
            this.contrasena = contrasena;
        } else {
            this.contrasena = "AAaa11._";
        }
    }

    // Constructor de copia: copia la contraseña de otro objeto Password
    public Password(Password copia) {
        this.contrasena = copia.contrasena;
    }

    // Getter: devuelve el valor de la contraseña
    public String getContrasena() {
        return contrasena;
    }

    // Setter: cambia la contraseña solo si es fuerte
    public boolean setContrasena(String nuevaContrasena) {
        if (esFuerte(nuevaContrasena)) {
            this.contrasena = nuevaContrasena;
            return true;
        }
        return false;
    }

    // Método toString: devuelve la contraseña como texto
    public String toString() {
        return "Contraseña: " + contrasena;
    }

    // Método esFuerte: comprueba si la contraseña cumple las reglas
    public boolean esFuerte(String validar) {
        // Debe tener al menos 8 caracteres
        if (validar.length() < 8) return false;

        // Variables para comprobar las condiciones
        boolean mayus = false;
        boolean minus = false;
        boolean num = false;
        boolean esp = false;

        // Recorremos la cadena carácter a carácter
        int i = 0;
        while (i < validar.length()) {
            char c = validar.charAt(i);
            int ascii = (int) c;

            // Mayúscula (A-Z)
            if (ascii >= 65 && ascii <= 90) mayus = true;
            // Minúscula (a-z)
            else if (ascii >= 97 && ascii <= 122) minus = true;
            // Número (0-9)
            else if (ascii >= 48 && ascii <= 57) num = true;
            // Caracter especial permitido: punto (.) o guión bajo (_)
            else if (ascii == 46 || ascii == 95) esp = true;

            i++;
        }

        // Solo si cumple todas las condiciones es fuerte
        return mayus && minus && num && esp;
    }
}
