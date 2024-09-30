package desafiovet.pessoa.dono.config;

import desafiovet.pessoa.dono.entity.Dono;
import desafiovet.pessoa.dono.service.DonoService;
import desafiovet.pet.entity.Pet;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
@Configuration
public class DonoConfig {
    @Autowired
    private DonoService donoService;


    public void init(){
        Dono exemplo = new Dono("Josue", 21, "12345678901",new Pet("fedorzinho", 2, 5.0));
        donoService.addNewDono(exemplo);
    }
}
