package consultorio;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private LocalDate fecha;
    private LocalTime hora;
    private Especialista especialista;
    private Paciente paciente;

    public Cita(LocalDate fecha, LocalTime hora, Especialista especialista, Paciente paciente) {
        this.fecha = fecha;
        this.hora = hora;
        this.especialista = especialista;
        this.paciente = paciente;
    }


    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    public Especialista getEspecialista() { return especialista; }
    public void setEspecialista(Especialista especialista) { this.especialista = especialista; }

    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", especialista=" + especialista.getNombreCompleto() +
                ", paciente=" + paciente.getNombre() +
                '}';
    }
}