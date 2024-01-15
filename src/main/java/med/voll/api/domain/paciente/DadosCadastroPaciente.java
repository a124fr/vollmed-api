package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, @Valid DadosEndereco endereco) {
}
