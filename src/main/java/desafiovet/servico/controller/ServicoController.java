package desafiovet.servico.controller;

import desafiovet.servico.entity.Servico;
import desafiovet.servico.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("api/servico")
public class ServicoController {
    @Autowired
    private ServicoService servicoService;

    @GetMapping
    public List<Servico> getServicos(){
        return servicoService.getServicos();
    }
    @DeleteMapping(path = "{servicoId}")
    public void deleteServico(@PathVariable("servicoId")Long servicoId){
        servicoService.deleteServico(servicoId);
    }
    @PostMapping
    public void addServico(@RequestBody Servico servico){
        servicoService.addNewServico(servico);
    }
}
