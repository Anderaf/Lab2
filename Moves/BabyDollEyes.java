package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class BabyDollEyes extends StatusMove {
    public BabyDollEyes(){
        super(Type.FAIRY, 0,100, 1, 1);
    }
    @Override
    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1);
    }
    @Override
    protected String describe(){
        return "строит глазки";
    }
}
