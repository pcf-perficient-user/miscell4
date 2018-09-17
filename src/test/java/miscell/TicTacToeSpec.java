package miscell;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TicTacToeSpec {
  @Rule
  public ExpectedException expectException=ExpectedException.none();
  private TicTacToe ticTacToe;

  @Before
  public void setup() {
    ticTacToe = new TicTacToe();
  }

  @Test
  public void when_x_outside_board_then_runTimeException() {
    expectException.expect(RuntimeException.class);
    ticTacToe.play(5,2);
  }
}
