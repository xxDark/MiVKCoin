package pw.mnx.mivkcoin.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import pw.mnx.mivkcoin.entity.machine.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "player")
@RequiredArgsConstructor
public class Player extends BaseEntity {

    @JsonIgnore
    private UUID uuid;

    private double balance;
    private double income;
    private BaseMachine recommendation;

    @OneToOne(cascade = CascadeType.ALL)
    private Click click;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card;
    @OneToOne(cascade = CascadeType.ALL)
    private Cards cards;
    @OneToOne(cascade = CascadeType.ALL)
    private SuperComputer superComputer;
    @OneToOne(cascade = CascadeType.ALL)
    private VkServer vkServer;
    @OneToOne(cascade = CascadeType.ALL)
    private QuantumComputer quantumComputer;


    public Player(double balance, int click, int card, int cards, int superComputer, int vkServer, int quantumComputer) {
        this.uuid = UUID.randomUUID();

        this.balance = balance;

        this.click = new Click(this, click);
        this.card = new Card(this, card);
        this.cards = new Cards(this, cards);
        this.superComputer = new SuperComputer(this, superComputer);
        this.vkServer = new VkServer(this, vkServer);
        this.quantumComputer = new QuantumComputer(this, quantumComputer);

        updateMachines();
    }


    private void updateMachines() {
        ArrayList<BaseMachine> baseMachineList = new ArrayList<>(Arrays.asList(click, card, cards, superComputer, vkServer, quantumComputer));
        baseMachineList.forEach(BaseMachine::calcPrice);
        baseMachineList.forEach(baseMachine -> this.income += baseMachine.getIncome());
    }

}
