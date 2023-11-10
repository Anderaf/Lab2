package Pokemon;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Passimian extends Pokemon {
    public Passimian(String name, int level){
        //level 97
        super(name, level);
        setStats(100, 120, 90, 40, 60, 80);
        setType(Type.FIGHTING);
    }
}
