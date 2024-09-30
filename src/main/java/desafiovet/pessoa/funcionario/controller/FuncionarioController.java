package desafiovet.pessoa.funcionario.controller;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import desafiovet.pessoa.funcionario.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> getFuncionarios(){
        return funcionarioService.getFuncionarios();
    }

    @DeleteMapping(path = "{funcionarioId}")
    public void deleteFuncionario(@PathVariable("funcionarioId")Long funcionarioId){
        funcionarioService.deleteFuncionario(funcionarioId);
    }
    @PostMapping
    public void addFuncionario(@RequestBody Funcionario funcionario){
        funcionarioService.addNewFuncionario(funcionario);
    }
}
