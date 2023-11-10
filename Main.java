import ru.ifmo.se.pokemon.*;
import Pokemon.*;
import Moves.*;

public class Main {
    Battle b = new Battle();
    Pokemon p1 = new Passimian("Passimian A", 97);
    Pokemon p2 = new Passimian("Passimian B", 97);

    b.addAlly(p1);
    b.addFoe(p2);
    b.go();
}
