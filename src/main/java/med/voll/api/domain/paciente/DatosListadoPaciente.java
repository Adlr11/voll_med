package med.voll.api.domain.paciente;

public record DatosListadoPaciente(String nombre, String telefono, String dni, String email) {

    public DatosListadoPaciente(Paciente paciente) {
        this(
            paciente.getNombre(),
            paciente.getTelefono(),
            paciente.getDni(),
            paciente.getEmail());
    }
}
