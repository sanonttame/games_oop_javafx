package ru.job4j;
/**
*
* Класс тестирующий класс Logic.
* @author Anton Narayan
 *@version 0.1
 * @since 27.10.19
*/
import org.junit.Test;
import ru.job4j.chess.Logic;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LogicTest {
    Figure bishop = new BishopBlack(Cell.C1);
    Figure stop = new BishopBlack(Cell.E3);
    Figure obstacle = new BishopBlack(Cell.D2);
    Logic logic = new Logic();
    @Test
    public void LogicMove() {
        logic.add(bishop);
        logic.add(stop);
        assertThat(logic.move(Cell.C1, Cell.D2), is(true));
    }
    @Test
    public void LogicMoveBeObstacle() {
        logic.add(bishop);
        logic.add(stop);
        logic.add(obstacle);
        assertThat(logic.move(Cell.C1, Cell.E3), is(false));
    }
}
