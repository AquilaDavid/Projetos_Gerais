package dev.java.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping
public class MissaoController {
    
    @GetMapping("/BemVindoMissao")
    public String Missao() {
        return "Você chegou as missões";
    }
    

}
