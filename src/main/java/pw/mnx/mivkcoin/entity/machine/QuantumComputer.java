package pw.mnx.mivkcoin.entity.machine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "quantumComputer")
public class QuantumComputer extends BaseMachine{

    private double price = 200D;
    private int amount = 0;
    @JsonIgnore
    private final double bonus = .5D;

    public QuantumComputer(Player player, int amount) {
        super(player, amount);
    }
    public QuantumComputer() {}
}
