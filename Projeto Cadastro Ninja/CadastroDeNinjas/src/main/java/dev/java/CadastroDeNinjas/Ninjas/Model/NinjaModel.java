package dev.java.CadastroDeNinjas.Ninjas.Model;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import dev.java.CadastroDeNinjas.Missoes.Model.MissaoModel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "Nome")
    private String nome;
    @Column(name = "E-mail", unique = true)
    private String email;

    @Column(name = "Idade")
    private int idade;

    @OneToMany(mappedBy = "ninja", cascade = CascadeType.ALL)
    @JsonManagedReference
    @Builder.Default
    private List<MissaoModel> missoes = new ArrayList<>();
    
}
