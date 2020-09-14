package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.HowToDefendStrategy;
import edu.utn.design.patterns.strategy.HowToAttackStrategy;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class Sorcerer extends Character {

    private Integer mana;

    public Sorcerer() {
        super();
    }

    public Sorcerer(String name, HowToAttackStrategy attackStrategy, HowToDefendStrategy defendStrategy, Integer mana) {
        super(name, attackStrategy, defendStrategy);
        this.mana = mana;
    }
}
