package desafiovet.pessoa.dono.controller;

import desafiovet.pessoa.dono.entity.Dono;
import desafiovet.pessoa.dono.service.DonoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dono")
public class DonoController {
    @Autowired
    private DonoService donoService;

    @GetMapping
    public List<Dono> getDonos(){
        return donoService.getDonos();
    }
    @DeleteMapping(path = "{donoId}")
    public void deleteDono(@PathVariable("donoId")Long donoId){
        donoService.deleteDono(donoId);
    }
    @PostMapping
    public void addDono(@RequestBody Dono dono){
        donoService.addNewDono(dono);
    }

}
