package pw.mnx.mivkcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pw.mnx.mivkcoin.entity.machine.SuperComputer;

@Repository

public interface SuperComputerRepository extends JpaRepository<SuperComputer, Long> {
}
