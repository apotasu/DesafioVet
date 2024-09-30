package desafiovet.pet.config;

import desafiovet.pessoa.dono.entity.Dono;
import desafiovet.pet.entity.Pet;
import desafiovet.pet.service.PetService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfig {
    @Autowired
    private PetService petService;


    public void init(){
        Pet exemplo = new Pet(new Dono("João", 21, "12345678901"),"Kazinski o destruir de mundos", 1, 99);
        petService.addNewPet(exemplo);
    }
}
