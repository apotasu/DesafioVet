package desafiovet.pessoa.dono.service;

import desafiovet.pessoa.dono.entity.Dono;
import desafiovet.pessoa.dono.repository.DonoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonoService {

    private static final Logger logger = LoggerFactory.getLogger(DonoService.class);

    @Autowired
    private DonoRepository donoRepository;

    public int getDonosSize() {
        int size = donoRepository.findAll().size();
        logger.info("Total de donos: {}", size);
        return size;
    }

    public List<Dono> getDonos() {
        List<Dono> donos = donoRepository.findAll();
        logger.info("Donos recuperados: {}", donos.size());
        return donos;
    }

    public void addNewDono(Dono dono) {
        donoRepository.save(dono);
        logger.info("Novo dono adicionado: {}", dono);
    }

    public void deleteDono(Long id) {
        Dono dono = donoRepository.findDonoById(id);
        if (dono != null) {
            donoRepository.delete(dono);
            logger.info("Dono deletado com ID: {}", id);
        } else {
            logger.warn("Tentativa de deletar dono com ID não encontrado: {}", id);
        }
    }
}
