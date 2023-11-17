package Pokemon;

import Moves.DazzlingGleam;
import Moves.Psychic;
import Moves.SweetKiss;
import ru.ifmo.se.pokemon.Type;

public class Togetic extends Togepi{
    public Togetic(){
        super();
    }
    public Togetic(String name, int level){
        //level 29
        super(name, level);
        addMove(new SweetKiss());
    }
}
