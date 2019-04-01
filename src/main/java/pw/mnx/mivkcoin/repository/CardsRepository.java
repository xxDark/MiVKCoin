package pw.mnx.mivkcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pw.mnx.mivkcoin.entity.machine.Cards;

@Repository
public interface CardsRepository extends JpaRepository<Cards,Long> {
}
