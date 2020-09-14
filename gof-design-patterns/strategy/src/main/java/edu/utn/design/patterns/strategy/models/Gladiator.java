package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.HowToDefendStrategy;
import edu.utn.design.patterns.strategy.HowToAttackStrategy;
import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Gladiator  extends Character {

    private String typeArmor;

    public Gladiator() {
        super();
    }

    public Gladiator(String name, HowToAttackStrategy attackStrategy, HowToDefendStrategy defendStrategy, String typeArmor) {
        super(name, attackStrategy, defendStrategy);
        this.typeArmor = typeArmor;
    }
}
