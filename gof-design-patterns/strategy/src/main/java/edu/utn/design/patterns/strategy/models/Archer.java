package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.HowToDefendStrategy;
import edu.utn.design.patterns.strategy.HowToAttackStrategy;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
public class Archer extends Character {

    private Integer rows;

    public Archer() {
        super();
    }

    public Archer(String name, HowToAttackStrategy attackStrategy, HowToDefendStrategy defendStrategy, Integer rows) {
        super(name, attackStrategy, defendStrategy);
        this.rows = rows;
    }
}
