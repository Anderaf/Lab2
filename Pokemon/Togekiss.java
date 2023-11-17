package Pokemon;

import Moves.DazzlingGleam;
import Moves.SweetKiss;

public class Togekiss extends Togetic{
    public Togekiss(){
        super();
    }
    public Togekiss(String name, int level){
        //level 29
        super(name, level);
        addMove(new DazzlingGleam());
    }
}
