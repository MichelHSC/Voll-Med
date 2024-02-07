package med.voll.api.medico;

import med.voll.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidades epecialidades,
                                  DadosEndereco endereco)
{

}
