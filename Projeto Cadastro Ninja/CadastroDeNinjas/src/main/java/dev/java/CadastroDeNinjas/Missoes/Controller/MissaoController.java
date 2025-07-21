package dev.java.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.java.CadastroDeNinjas.Missoes.DTO.MissaoDTO;
import dev.java.CadastroDeNinjas.Missoes.DTO.MissaoResponseveDTO;
import dev.java.CadastroDeNinjas.Missoes.Model.MissaoModel;
import dev.java.CadastroDeNinjas.Missoes.Service.MissaoService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/Missoes")
@RequiredArgsConstructor
public class MissaoController {
    
    private final MissaoService missaoService;

    @GetMapping("/BemVindoMissao")
    public String Missao() {
        return "Você chegou as missões";
    }

    @PostMapping
    public ResponseEntity<Void> salvarMissao(@RequestParam MissaoDTO dto) {
        missaoService.salvarMissao(dto);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping
    public ResponseEntity<MissaoResponseveDTO> buscarMissao(@RequestParam Long id) {
        MissaoModel model = missaoService.buscarMissao(id);
        MissaoResponseveDTO response = new MissaoResponseveDTO(model.getNome(), model.getClassificacao(), false);
        return ResponseEntity.ok(response);
    }
    
    @PutMapping
    public ResponseEntity<Void> atualizarDadosMisssao(Long id, @RequestBody MissaoResponseveDTO dto){
        missaoService.AtualizarMisssao(id, dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarMissao(Long id){
        missaoService.DeletarMissao(id);
        return ResponseEntity.noContent().build();
    }

}
