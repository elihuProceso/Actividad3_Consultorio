package consultorio;

import java.util.ArrayList;
import java.util.List;

public class Catalogos {
    private List<Especialista> especialistas;
    private List<Paciente> pacientes;
    private List<Cita> citas;

    public Catalogos() {
        this.especialistas = new ArrayList<>();
        this.pacientes = new ArrayList<>();
        this.citas = new ArrayList<>();
    }


    public void agregarEspecialista(Especialista especialista) {
        especialistas.add(especialista);
    }

    public void eliminarEspecialista(String cedulaProfesional) {
        especialistas.removeIf(e -> e.getCedulaProfesional().equalsIgnoreCase(cedulaProfesional));
    }


    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void eliminarPaciente(String nombre) {
        pacientes.removeIf(p -> p.getNombre().equalsIgnoreCase(nombre));
    }

    public void darDeAltaCita(Cita cita) {
        citas.add(cita);
    }

    public void cancelarCita(Cita cita) {
        citas.remove(cita);
    }

    public List<Especialista> getEspecialistas() { return especialistas; }
    public List<Paciente> getPacientes() { return pacientes; }
    public List<Cita> getCitas() { return citas; }

    @Override
    public String toString() {
        return "Consultorio{" +
                "especialistas=" + especialistas.size() +
                ", pacientes=" + pacientes.size() +
                ", citasActivas=" + citas.size() +
                '}';
    }
}