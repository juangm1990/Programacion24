package TercerTrimestre.CRUD.GestorCine_ID;

import java.sql.Date;
import java.sql.Time;

public class Reserva {
    private int id;
    private int idPelicula;
    private int idSala;
    private Date fecha;
    private Time hora;
    private String nombreCliente;
    private int asientosReservados;

    public Reserva() {}

    public Reserva(int id, int idPelicula, int idSala, Date fecha, Time hora, String nombreCliente, int asientosReservados) {
        this.id = id;
        this.idPelicula = idPelicula;
        this.idSala = idSala;
        this.fecha = fecha;
        this.hora = hora;
        this.nombreCliente = nombreCliente;
        this.asientosReservados = asientosReservados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getAsientosReservados() {
        return asientosReservados;
    }

    public void setAsientosReservados(int asientosReservados) {
        this.asientosReservados = asientosReservados;
    }

    @Override
    public String toString() {
        return "Reserva{" +
               "id=" + id +
               ", idPelicula=" + idPelicula +
               ", idSala=" + idSala +
               ", fecha=" + fecha +
               ", hora=" + hora +
               ", nombreCliente='" + nombreCliente + '\'' +
               ", asientosReservados=" + asientosReservados +
               '}';
    }
}