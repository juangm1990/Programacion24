package PrimerTrimestre.EjerciciosClase.Tarea_6;

public class Persona {
        // Atributos y métodos = Las características

        private String nombre;
        private String apellidos;
        private String fechaNac;
        private int edad;
        private Dni dni;
    
    
    
        // El constructor
        public Persona (String n, String ape, String fec, int edad){
    
            this.nombre = n;
            this.apellidos = ape;
            this.fechaNac = fec;  
            this.edad = edad;    
    
        }
        
        // Métodos utilizados fuera de la clase para ser utilizado por los atributos (Operaciones)
    
        public String getNombre(){
            return this.nombre;
        }
    
        public void setNombre(String n){
            this.nombre = n;
        }
    
        public String getApellidos(){
            return this.apellidos;
        }
    
        public void setApellidos(String ape){
            this.apellidos = ape;
        }
    
        public String getFechaNac(){
            return this.fechaNac;
        }
    
        public void setFechaNac(String fec){
            this.fechaNac = fec;
        }
    
        public int getEdad(){
            return this.edad;
        }
    
        public void setEdad(int ed){
            this.edad = ed;
        }
    
        public Dni getDni(){
    
            return this.dni;
        }
    
        public void setDni(Dni d){
            this.dni = d;
        }
    
        //¿Qué hace? ¿Qué recibe? ¿Qué devuelve? (Visualizarlo)
    
        public String toString(){
            return "Nombre " + this.nombre + 
                   " Apellidos " + this.apellidos + 
                   " Fecha nacimiento " + this.fechaNac + 
                   " Edad " + this.edad;
        }
}
