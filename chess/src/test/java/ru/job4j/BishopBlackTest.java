package ru.job4j;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;

public class BishopBlackTest {
    public BishopBlack bishop = new BishopBlack(Cell.C1);
    @Test
    public void BishopBlackPosition() {
        assertThat(Cell.C1, is(bishop.position()));
    }
    @Test
    public void BishopBlackCopy() {
        Figure figure = bishop.copy(Cell.G4);
        assertThat(Cell.G4, is(figure.position()));
    }
    @Test
    public void BishopBlackMove1() {
        Cell[] steps = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(steps, is(bishop.way(Cell.C1, Cell.G5)));
    }
    @Test
    public void BishopBlackMove2() {
        Cell[] steps = new Cell[]{Cell.C3, Cell.D2, Cell.E1};
        assertThat(steps, is(bishop.way(Cell.B4, Cell.E1)));
    }
    @Test
    public void BishopBlackMove3() {
        Cell[] steps = new Cell[]{Cell.F4, Cell.E3, Cell.D2, Cell.C1};
        assertThat(steps, is(bishop.way(Cell.G5, Cell.C1)));
    }
    @Test
    public void BishopBlackMove4() {
        Cell[] steps = new Cell[]{Cell.F6, Cell.E7, Cell.D8};
        assertThat(steps, is(bishop.way(Cell.G5, Cell.D8)));
    }
}
