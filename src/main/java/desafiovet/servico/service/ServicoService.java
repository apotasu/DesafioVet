package desafiovet.servico.service;

import desafiovet.servico.entity.Servico;
import desafiovet.servico.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {
    @Autowired
    private ServicoRepository servicoRepository;

    public List<Servico> getServicos(){
        return servicoRepository.findAll();
    }
    public void addNewServico(Servico servico){
        servicoRepository.save(servico);
    }
    public void deleteServico(Long id){
        servicoRepository.delete(servicoRepository.findServicoById(id));
    }
}
