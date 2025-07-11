package dev.java.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.java.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.java.CadastroDeNinjas.Ninjas.DTO.NinjaResponseDTO;
import dev.java.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.java.CadastroDeNinjas.Ninjas.Service.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/ninjas")
@RequiredArgsConstructor
public class Controller {


    private final NinjaService ninjaService;

    // Rota de boas-vindas (GET)
    @GetMapping("/bem-vindo")
    public ResponseEntity<String> mensagem() {
        return ResponseEntity.ok("Bem-vindo à API de Ninjas!");
    }

    @PostMapping
    public ResponseEntity<Void> salvarNinja(@RequestBody NinjaDTO dto){
        ninjaService.salvarNinja(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<NinjaResponseDTO> BuscarNinja(@RequestParam Long id){
        NinjaModel model = ninjaService.BuscarNinja(id);
        NinjaResponseDTO response = new NinjaResponseDTO(
            model.getNome(),
            model.getEmail()
        );
       return ResponseEntity.ok(response);
    }

    
    @PutMapping 
    public ResponseEntity<Void> atualizarNinja(  Long id, @RequestBody NinjaResponseDTO ninja) {
        ninjaService.atualizarDadosNinja(id, ninja);
        return ResponseEntity.ok().build();
    }

  
    @DeleteMapping
    public ResponseEntity<Void> deletarNinja( Long id) {
        ninjaService.deletarNinja(id);
        return ResponseEntity.noContent().build();
    }
    
}
