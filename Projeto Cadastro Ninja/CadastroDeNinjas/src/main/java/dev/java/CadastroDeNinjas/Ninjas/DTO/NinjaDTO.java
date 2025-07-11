package dev.java.CadastroDeNinjas.Ninjas.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class NinjaDTO {

    private String nome;
    private String email;
    private int idade;
}
