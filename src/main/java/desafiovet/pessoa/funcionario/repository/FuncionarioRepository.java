package desafiovet.pessoa.funcionario.repository;

import desafiovet.pessoa.funcionario.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    @Query("SELECT f FROM Funcionario f WHERE f.id=?1")
    Funcionario findFuncionarioById(Long id);
}