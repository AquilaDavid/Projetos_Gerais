package dev.java.CadastroDeNinjas.Ninjas.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class NinjaResponseDTO {
    
    private String nome;
    private String email;
    private int idade;

    public NinjaResponseDTO(String nome, String email){
        this.nome = nome;
        this.email = email;
    } 
}
