package dev.java.CadastroDeNinjas.Ninjas.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
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
    public ResponseEntity<Void> salvarNinja(@RequestBody NinjaModel ninja){
        ninjaService.salvarNinja(ninja);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<NinjaModel> BuscarNinja(@RequestParam Long id){
       return ResponseEntity.ok(ninjaService.BuscarNinja(id));
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarNinja(@PathVariable Long id, @RequestBody NinjaModel ninja) {
        ninjaService.atualizarNinja(id, ninja);
        return ResponseEntity.ok().build();
    }

  
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        return ResponseEntity.noContent().build();
    }
    
}
