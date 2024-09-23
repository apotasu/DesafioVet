package desafiovet.pessoa.dono.repository;

import desafiovet.pessoa.dono.entity.Dono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DonoRepository extends JpaRepository<Dono, Long> {
    @Query("SELECT d FROM Dono d WHERE d.id=?1")
    Dono findDonoById(Long id);

    //Pq eu não consigo fazer isso?
    @Query("SELECT d FROM Dono d WHERE d.documento= ?1")
    Optional<Dono> findDonoByDocumento(String documento);

}