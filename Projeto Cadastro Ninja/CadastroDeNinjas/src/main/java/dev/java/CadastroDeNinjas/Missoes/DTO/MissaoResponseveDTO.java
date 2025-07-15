package dev.java.CadastroDeNinjas.Missoes.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class MissaoResponseveDTO {
    private String nome;
    private int classificacao;
    private boolean concluida;

}
