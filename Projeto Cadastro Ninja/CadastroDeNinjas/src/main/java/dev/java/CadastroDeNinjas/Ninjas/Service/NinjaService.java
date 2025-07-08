package dev.java.CadastroDeNinjas.Ninjas.Service;




import org.springframework.stereotype.Service;

import dev.java.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.java.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NinjaService {

    private final NinjaRepository repository;

    // Metodos CRUD

    public void salvarNinja(NinjaModel ninja){
        repository.saveAndFlush(ninja);
    }

    public NinjaModel BuscarNinja(Long id ){
        return repository.findById(id).orElseThrow(
            () -> new RuntimeException("Ninja não encontrado")
        );
    }

    public void deletarNinja(Long id){
        repository.deleteById(id);
    }


    public void atualizarNinja(Long id, NinjaModel ninja){
       NinjaModel ninjaEntity = BuscarNinja(id);
       NinjaModel ninjaAtualizado = NinjaModel.builder()
       .id(ninjaEntity.getId())
       .nome( ninja.getNome() != null ? ninja.getNome() : ninjaEntity.getNome() )
       .idade(ninja.getIdade() >= 0 ? ninja.getIdade() : ninjaEntity.getIdade())
       .email(ninja.getEmail() != null ? ninja.getEmail() : ninjaEntity.getEmail())
       .build();

       repository.saveAndFlush(ninjaAtualizado);
    }
    
}
