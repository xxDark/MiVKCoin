package pw.mnx.mivkcoin.entity.machine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "card")
public class Card extends BaseMachine {

    private double price = .1D;
    private int amount = 0;

    @JsonIgnore
    private final double bonus = .003D;

    public Card(Player player, int amount) {
        super(player, amount);
    }

    public Card() {}
}
