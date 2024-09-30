package desafiovet.servico.service;

import desafiovet.servico.entity.Servico;
import desafiovet.servico.repository.ServicoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    private static final Logger logger = LoggerFactory.getLogger(ServicoService.class);

    @Autowired
    private ServicoRepository servicoRepository;

    public int getServicoSize() {
        int size = servicoRepository.findAll().size();
        logger.info("Total de serviços: {}", size);
        return size;
    }

    public List<Servico> getServicos() {
        List<Servico> servicos = servicoRepository.findAll();
        logger.info("Serviços recuperados: {}", servicos.size());
        return servicos;
    }

    public void addNewServico(Servico servico) {
        servicoRepository.save(servico);
        logger.info("Novo serviço adicionado: {}", servico);
    }

    public void deleteServico(Long id) {
        Servico servico = servicoRepository.findServicoById(id);
        if (servico != null) {
            servicoRepository.delete(servico);
            logger.info("Serviço deletado com ID: {}", id);
        } else {
            logger.warn("Tentativa de deletar serviço com ID não encontrado: {}", id);
        }
    }
}
