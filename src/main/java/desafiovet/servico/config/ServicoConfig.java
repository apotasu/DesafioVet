package desafiovet.servico.config;

import desafiovet.pessoa.dono.entity.Dono;
import desafiovet.pessoa.funcionario.entity.Funcionario;
import desafiovet.pet.entity.Pet;
import desafiovet.servico.entity.Servico;
import desafiovet.servico.service.ServicoService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ServicoConfig {
    @Autowired
    private ServicoService servicoService;
    @PostConstruct
    public void init(){
        Pet exemplo = new Pet(new Dono("João", 21, "12345678901"),"Kazinski o destruir de mundos", 1, 99);
        Funcionario funcionario = new Funcionario("Ricardo", 30, "12345678912", 3000);
        ArrayList<Funcionario> exemploArray = new ArrayList<>();
        Servico servico = new Servico(exemploArray, exemplo, 3, 9);
        servicoService.addNewServico(servico);
    }
}
