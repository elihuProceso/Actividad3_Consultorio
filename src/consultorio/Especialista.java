package consultorio;

public class Especialista {
    private String nombreCompleto;
    private String especialidad;
    private String cedulaProfesional;
    private String telefono;
    private String email;

    public Especialista(String nombreCompleto, String especialidad, String cedulaProfesional, String telefono, String email) {
        this.nombreCompleto = nombreCompleto;
        this.especialidad = especialidad;
        this.cedulaProfesional = cedulaProfesional;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombreCompleto() { return nombreCompleto; }
    public void setNombreCompleto(String nombreCompleto) { this.nombreCompleto = nombreCompleto; }

    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public String getCedulaProfesional() { return cedulaProfesional; }
    public void setCedulaProfesional(String cedulaProfesional) { this.cedulaProfesional = cedulaProfesional; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Especialista{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", cedulaProfesional='" + cedulaProfesional + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}