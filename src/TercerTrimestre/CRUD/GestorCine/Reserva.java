package TercerTrimestre.CRUD.GestorCine;

import java.sql.Date;
import java.sql.Time;

public class Reserva {
    private int id;
    private int peliculaID;
    private int salaID;
    private Date fecha;
    private Time hora;
    private String cliente;
    private int asientos;

    // Constructor con ID
    public Reserva(int id, int peliculaID, int salaID, Date fecha, Time hora, String cliente, int asientos) {
        this.id = id;
        this.peliculaID = peliculaID;
        this.salaID = salaID;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.asientos = asientos;
    }

    // Constructor sin ID (para insertar)
    public Reserva(int peliculaID, int salaID, Date fecha, Time hora, String cliente, int asientos) {
        this.peliculaID = peliculaID;
        this.salaID = salaID;
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.asientos = asientos;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeliculaID() {
        return peliculaID;
    }

    public void setPeliculaID(int peliculaID) {
        this.peliculaID = peliculaID;
    }

    public int getSalaID() {
        return salaID;
    }

    public void setSalaID(int salaID) {
        this.salaID = salaID;
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

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Reserva [ID=" + id + ", PelículaID=" + peliculaID + ", SalaID=" + salaID +
               ", Fecha=" + fecha + ", Hora=" + hora + ", Cliente=" + cliente + ", Asientos=" + asientos + "]";
    }
}
