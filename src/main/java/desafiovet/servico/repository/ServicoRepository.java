package desafiovet.servico.repository;

import desafiovet.servico.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long> {
    @Query("SELECT s FROM Servico s WHERE s.id=?1")
    Servico findServicoById(Long id);
}