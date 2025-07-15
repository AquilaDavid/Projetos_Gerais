package dev.java.CadastroDeNinjas.Missoes.Service;

import org.springframework.stereotype.Service;

import dev.java.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.java.CadastroDeNinjas.Missoes.DTO.MissaoResponseveDTO;
import dev.java.CadastroDeNinjas.Missoes.Model.MissaoModel;
import dev.java.CadastroDeNinjas.Missoes.Repository.MissaoRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RequiredArgsConstructor
@Service

public class MissaoService {
    private final MissaoRepository repository;

    // Metodos CRUD

    public void salvarMissao(MissaoDTO dto){
        MissaoModel model = MissaoModel.builder()
        .nome(dto.getNome())
        .classificacao(dto.getClassificacao())
        .concluida(dto.isConcluida())
        .build();

        repository.saveAndFlush(model);
    }

    public MissaoModel buscarMissao(long id){
        MissaoModel model = repository.findById(id).orElseThrow(() -> new RuntimeException("Missão não encontrada"));
        return model;
    }

    public void AtualizarMisssao(Long id, MissaoResponseveDTO dto){
        MissaoModel model = repository.findById(id).orElseThrow(() -> new RuntimeException("Missão não encontrda, Dados não seram atualizadados"));
        MissaoModel missaoAtalizada = MissaoModel.builder()
        .id(model.getId())
        .nome(dto.getNome() != null ? dto.getNome() : model.getNome())
        .classificacao(dto.getClassificacao() >= 0 ? dto.getClassificacao() : model.getClassificacao())
        .concluida(dto.isConcluida() ? dto.isConcluida() : model.isConcluida())
        .build();

        repository.saveAndFlush(missaoAtalizada);

    }

    public void DeletarMissao(Long id){
        repository.deleteById(id);
    }

}
