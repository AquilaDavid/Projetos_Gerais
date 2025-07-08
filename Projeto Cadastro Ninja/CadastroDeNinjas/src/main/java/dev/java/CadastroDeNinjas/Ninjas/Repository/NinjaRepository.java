package dev.java.CadastroDeNinjas.Ninjas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dev.java.CadastroDeNinjas.Ninjas.Model.NinjaModel;

public interface NinjaRepository extends JpaRepository< NinjaModel, Long >{
    
}
