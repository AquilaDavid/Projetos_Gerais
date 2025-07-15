package dev.java.CadastroDeNinjas.Missoes.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table( name = "tb_missao")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column( name = "Nome da Missão")
    private String nome;
    @Column(name = "Nivel da Missão")
    private int classificacao;
    @Column(name = "Concluida")
    private boolean concluida;   
    
    
}
