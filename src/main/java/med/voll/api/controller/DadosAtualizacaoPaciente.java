package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone, @Valid DadosEndereco endereco) {
}
