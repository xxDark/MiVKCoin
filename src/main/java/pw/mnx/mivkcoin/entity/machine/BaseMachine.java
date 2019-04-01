package pw.mnx.mivkcoin.entity.machine;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import pw.mnx.mivkcoin.entity.BaseEntity;
import pw.mnx.mivkcoin.entity.Player;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

@MappedSuperclass
@EqualsAndHashCode(callSuper = true)
@Data
public abstract class BaseMachine extends BaseEntity {

    @OneToOne
    @JsonIgnore
    private Player player;
    private int amount;
    private double price;
    private double bonus;


    BaseMachine(Player player, int amount) {
        this.player = player;
        this.amount = amount;
    }

    BaseMachine() {}
}
