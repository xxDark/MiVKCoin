package pw.mnx.mivkcoin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pw.mnx.mivkcoin.entity.Player;
import pw.mnx.mivkcoin.repository.PlayerRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;

    public void savePlayer(Player player) {
        playerRepository.saveAndFlush(player);
    }

    public Player getPlayer(UUID playerUUID) {
        return playerRepository.findByUuid(playerUUID).orElse(null);
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public void updatePlayerBalance(UUID playerUUID, double balance) {
        playerRepository.findByUuid(playerUUID).ifPresent(player -> player.setBalance(balance));
    }
}
