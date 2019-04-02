package pw.mnx.mivkcoin.entity.machine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "cards")
public class Cards extends BaseMachine {

    private double price = 1D;
    private int amount = 0;
    private double income;

    @JsonIgnore
    private final double bonus = .01D;

    public Cards(Player player, int amount) {
        super(player, amount);
    }
    public Cards() {}
}
