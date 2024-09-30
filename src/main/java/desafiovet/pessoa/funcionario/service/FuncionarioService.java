package desafiovet.pessoa.funcionario.service;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import desafiovet.pessoa.funcionario.repository.FuncionarioRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private static final Logger logger = LoggerFactory.getLogger(FuncionarioService.class);

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public int getFuncionariosSize() {
        int size = funcionarioRepository.findAll().size();
        logger.info("Total de funcionários: {}", size);
        return size;
    }

    public List<Funcionario> getFuncionarios() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        logger.info("Funcionários recuperados: {}", funcionarios.size());
        return funcionarios;
    }

    public void addNewFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
        logger.info("Novo funcionário adicionado: {}", funcionario);
    }

    public void deleteFuncionario(Long id) {
        Funcionario funcionario = funcionarioRepository.findFuncionarioById(id);
        if (funcionario != null) {
            funcionarioRepository.delete(funcionario);
            logger.info("Funcionário deletado com ID: {}", id);
        } else {
            logger.warn("Tentativa de deletar funcionário com ID não encontrado: {}", id);
        }
    }
}
