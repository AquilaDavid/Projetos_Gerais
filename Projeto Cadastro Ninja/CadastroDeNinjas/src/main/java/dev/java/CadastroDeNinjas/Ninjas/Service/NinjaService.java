package dev.java.CadastroDeNinjas.Ninjas.Service;



import org.springframework.stereotype.Service;

import dev.java.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.java.CadastroDeNinjas.Ninjas.DTO.NinjaResponseDTO;
import dev.java.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.java.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NinjaService {

    private final NinjaRepository repository;

    // Metodos CRUD

    public void salvarNinja(NinjaDTO dto){
        NinjaModel model = NinjaModel.builder()
        .nome(dto.getNome())
        .idade(dto.getIdade())
        .email(dto.getEmail())
        .build();
        repository.saveAndFlush(model);
    }

    public NinjaModel BuscarNinja(Long id ){
        NinjaModel model = repository.findById(id).orElseThrow(() -> new RuntimeException("Ninja não encontrado"));
        return model;
    }

    public void deletarNinja(Long id){
        repository.deleteById(id);
    }


    public void atualizarDadosNinja(Long id, NinjaResponseDTO dto){
       NinjaModel model = repository.findById(id).orElseThrow(() -> new RuntimeException("Não é possivel atualizar os dados de um ninja insistente"));
       NinjaModel ninjaAtualizado = NinjaModel.builder()
       .id(model.getId())
       .nome( dto.getNome() != null ? dto.getNome() : model.getNome() )
       .idade(dto.getIdade() >= 0 ? dto.getIdade() : model.getIdade())
       .email(dto.getEmail() != null ? dto.getEmail() : model.getEmail())
       .build();

       repository.saveAndFlush(ninjaAtualizado);
    }
    
}
