package desafiovet.pessoa.funcionario.config;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import desafiovet.pessoa.funcionario.service.FuncionarioService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FuncionarioConfig {
    @Autowired
    private FuncionarioService funcionarioService;
    @PostConstruct
    public void init(){
        Funcionario exemplo = new Funcionario("Josue", 21, "12345678901", 2000);
        funcionarioService.addNewFuncionario(exemplo);
    }
}
