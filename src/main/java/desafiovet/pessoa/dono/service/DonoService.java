package desafiovet.pessoa.dono.service;


import desafiovet.pessoa.dono.entity.Dono;
import desafiovet.pessoa.dono.repository.DonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonoService {
    @Autowired
    private DonoRepository donoRepository;

    public List<Dono> getDonos(){
        return donoRepository.findAll();
    }
    public void addNewDono(Dono dono)   {
        donoRepository.save(dono);
    }
    public void deleteDono(Long id){
        donoRepository.delete(donoRepository.findDonoById(id));
    }
}
