package pw.mnx.mivkcoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pw.mnx.mivkcoin.entity.machine.VkServer;
@Repository
public interface VkServerRepository extends JpaRepository<VkServer, Long> {
}
