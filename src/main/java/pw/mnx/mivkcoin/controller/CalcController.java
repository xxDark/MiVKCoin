package pw.mnx.mivkcoin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pw.mnx.mivkcoin.entity.Player;
import pw.mnx.mivkcoin.service.PlayerService;

import java.util.UUID;

@RestController
@RequestMapping(path = "/calc/", method = RequestMethod.GET)
@RequiredArgsConstructor
public class CalcController {
    private final PlayerService playerService;

    @RequestMapping(path = "createPlayer/{click}/{card}/{cards}/{super_computer}/{vk_server}/{quantum_computer}/{balance}", method = RequestMethod.POST)
    public ResponseEntity createPlayer(@PathVariable int click, @PathVariable int card, @PathVariable int cards, @PathVariable int super_computer, @PathVariable int vk_server, @PathVariable int quantum_computer, @PathVariable int balance) {
        Player player = new Player(balance, click, card, cards, super_computer, vk_server, quantum_computer);
        playerService.savePlayer(player);
        return new ResponseEntity<>(player.getUuid(), HttpStatus.OK);
    }

    @RequestMapping(path = "updateBalance/{playerUUID}/{balance}", method = RequestMethod.GET)
    public ResponseEntity updateBalance(@PathVariable UUID playerUUID, @PathVariable double balance) {
        playerService.updatePlayerBalance(playerUUID, balance);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @RequestMapping(path = "getInfo/{playerUUID}")
    public ResponseEntity getInfo(@PathVariable UUID playerUUID) {
        Player player = playerService.getInfo(playerUUID);
        return new ResponseEntity<>(player, HttpStatus.OK);
    }

}
