package desafiovet.pessoa.funcionario.service;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import desafiovet.pessoa.funcionario.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> getFuncionarios(){
        return funcionarioRepository.findAll();
    }
    public void addNewFuncionario(Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }
    public void deleteFuncionario(Long id){
        funcionarioRepository.delete(funcionarioRepository.findFuncionarioById(id));
    }
}
