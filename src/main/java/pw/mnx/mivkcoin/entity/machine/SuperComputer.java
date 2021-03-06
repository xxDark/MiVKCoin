package pw.mnx.mivkcoin.entity.machine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "superComputer")
public class SuperComputer extends BaseMachine{
    private double price = 10D;
    private int amount = 0;
    private double income;

    @JsonIgnore
    private final double bonus = .03D;

    public SuperComputer(Player player, int amount) {
        super(player, amount);
    }
    public SuperComputer() {}
}
