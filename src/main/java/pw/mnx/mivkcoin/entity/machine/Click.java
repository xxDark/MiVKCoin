package pw.mnx.mivkcoin.entity.machine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "click")
public class Click extends BaseMachine {

    private double price = .03D;
    private int amount = 0;

    @JsonIgnore
    private final double bonus = .001D;

    public Click(Player player, int amount) {
        super(player, amount);
    }
    public Click() {}
}
