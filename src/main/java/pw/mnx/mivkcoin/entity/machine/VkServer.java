package pw.mnx.mivkcoin.entity.machine;


import com.fasterxml.jackson.annotation.JsonIgnore;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vkServer")
public class VkServer extends BaseMachine{

    private double price = .50D;
    private int amount = 0;
    private double income;

    @JsonIgnore
    private final double bonus = .1D;

    public VkServer(Player player, int amount) {
        super(player, amount);
    }
    public VkServer() {}
}
