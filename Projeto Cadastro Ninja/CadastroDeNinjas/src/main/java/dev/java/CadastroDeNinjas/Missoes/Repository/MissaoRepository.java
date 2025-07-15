package dev.java.CadastroDeNinjas.Missoes.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.java.CadastroDeNinjas.Missoes.Model.MissaoModel;


public interface MissaoRepository extends JpaRepository<MissaoModel, Long> {
    
}
