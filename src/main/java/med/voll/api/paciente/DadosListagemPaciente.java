package med.voll.api.paciente;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf, String telefone) {

    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getTelefone());
    }
}
