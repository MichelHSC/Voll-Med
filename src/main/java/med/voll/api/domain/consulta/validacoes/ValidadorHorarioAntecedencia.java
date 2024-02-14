package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;

import java.time.Duration;
import java.time.LocalDateTime;

public class ValidadorHorarioAntecedencia {

    public void validar(DadosAgendamentoConsulta dados){
        var dataConsulta = dados.data();
        var dataAgora = LocalDateTime.now();
        var diferencaMinutos = Duration.between(dataAgora, dataConsulta).toMinutes();

        if(diferencaMinutos < 30){
            throw new ValidacaoException("Consulta deve ser agendada com antecendencia minima de 30min!!");
        }



    }
}
