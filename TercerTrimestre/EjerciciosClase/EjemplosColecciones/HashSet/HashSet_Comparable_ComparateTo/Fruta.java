package TercerTrimestre.EjerciciosClase.EjemplosColecciones.HashSet.HashSet_Comparable_ComparateTo;

public class Fruta implements Comparable<Fruta> {
    private String nombre;

    public Fruta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Fruta otra) {
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fruta)) return false;
        Fruta otra = (Fruta) obj;
        return this.nombre.equalsIgnoreCase(otra.nombre);
    }

    @Override
    public int hashCode() {
        
        return nombre.toLowerCase().hashCode();
    }

    // Misma altura y nombre (duplicados en función de un criterio) HASHSET
    // TENEMOS UNA CLASE TIENE UN ATRIBUTO QUE TIENE UN ARRAY, IDENTIFICAR DOS OBJETOS DE LA MISMA CLASE SI EN ESE ARRAYLIST TIENE 2 ELEMENTOS QUE SE REPITEN. 
    // HAY DEFINIR UNA FUNCION PARA QUE BUSCAR SI TIENE DOS ELEMENTOS IGUALES. SABER COMO FUNCIONA IQUAL Y HASCODE QUE LOS DOS ARRAY SEAN IGUALES, COGER 3 VARIABLES Y COMPARAR

    //TREE SET
    /* public int compareTo (Producto o){
    IF (this.precio<o.precio)return -1;
    else if (this.precio==o.precio)
    return 0;
    else return 1; 
    }
     */ 


}
