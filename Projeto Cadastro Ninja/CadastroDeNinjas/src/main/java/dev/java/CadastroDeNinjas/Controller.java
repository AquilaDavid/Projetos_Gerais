package dev.java.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/BemVindo")
    public String bemVindo(){
        return "Você fez sua primeira rota no SpringBoot";
    }
    
}
