package edu.utn.design.patterns.strategy.models;

import edu.utn.design.patterns.strategy.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character {

    private String name;
    private HowToAttackStrategy attackStrategy;
    private HowToDefendStrategy defendStrategy;

    public void attack() {
        this.attackStrategy.attack();
    }

    public void defend() {
        this.defendStrategy.defend();
    }

    public void move(DirectionOfMovement direction, Integer cell) {

        if( DirectionOfMovement.SOUTH.equals(direction) && cell==3){
            attackStrategy = new HowToAttackWithAxe();
            defendStrategy = new HowToNotDefend();
        }
        else{
            attackStrategy = new HowToAttackWithSword();
            defendStrategy = new HowToDefendWithSword();
        }
    }

}


