package co.iyubinest.conway;

import org.junit.Test;

import static co.iyubinest.conway.Cell.ALIVE;
import static co.iyubinest.conway.Cell.DEATH;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WorldShould {

  @Test
  public void killByLonelinessWithZeroNeighbors() {
    assertThat(
        RealWorld.create(
            DEATH, DEATH, DEATH,
            DEATH, ALIVE, DEATH,
            DEATH, DEATH, DEATH
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + "   %n"
                    + "   %n"
                    + "   "
            )
        )
    );
  }

  @Test
  public void killByOverPopulationWithFourNeighbors() {
    assertThat(
        RealWorld.create(
            ALIVE, DEATH, ALIVE,
            DEATH, ALIVE, DEATH,
            ALIVE, DEATH, ALIVE
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + " X %n"
                    + "X X%n"
                    + " X "
            )
        )
    );
  }

  @Test
  public void killByOverPopulationWithFiveNeighbors() {
    assertThat(
        RealWorld.create(
            ALIVE, ALIVE, ALIVE,
            DEATH, ALIVE, DEATH,
            ALIVE, DEATH, ALIVE
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + "XXX%n"
                    + "   %n"
                    + " X "
            )
        )
    );
  }

  @Test
  public void blinker() {
    assertThat(
        RealWorld.create(
            DEATH,DEATH,DEATH,DEATH,DEATH,
            DEATH,DEATH,ALIVE,DEATH,DEATH,
            DEATH,DEATH,ALIVE,DEATH,DEATH,
            DEATH,DEATH,ALIVE,DEATH,DEATH,
            DEATH,DEATH,DEATH,DEATH,DEATH
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + "     %n"
                    + "     %n"
                    + " XXX %n"
                    + "     %n"
                    + "     "
            )
        )
    );
  }

  @Test
  public void blinkerBack() {
    assertThat(
        RealWorld.create(
            DEATH,DEATH,DEATH,DEATH,DEATH,
            DEATH,DEATH,DEATH,DEATH,DEATH,
            DEATH,ALIVE,ALIVE,ALIVE,DEATH,
            DEATH,DEATH,DEATH,DEATH,DEATH,
            DEATH,DEATH,DEATH,DEATH,DEATH
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + "     %n"
                    + "  X  %n"
                    + "  X  %n"
                    + "  X  %n"
                    + "     "
            )
        )
    );
  }

  @Test
  public void beacon() {
    assertThat(
        RealWorld.create(
            DEATH,DEATH,DEATH,DEATH,DEATH,DEATH,
            DEATH,ALIVE,ALIVE,DEATH,DEATH,DEATH,
            DEATH,ALIVE,ALIVE,DEATH,DEATH,DEATH,
            DEATH,DEATH,DEATH,ALIVE,ALIVE,DEATH,
            DEATH,DEATH,DEATH,ALIVE,ALIVE,DEATH,
            DEATH,DEATH,DEATH,DEATH,DEATH,DEATH
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + "      %n"
                    + " XX   %n"
                    + " X    %n"
                    + "    X %n"
                    + "   XX %n"
                    + "      "
            )
        )
    );
  }

  @Test
  public void beaconBack() {
    assertThat(
        RealWorld.create(
            DEATH,DEATH,DEATH,DEATH,DEATH,DEATH,
            DEATH,ALIVE,ALIVE,DEATH,DEATH,DEATH,
            DEATH,ALIVE,DEATH,DEATH,DEATH,DEATH,
            DEATH,DEATH,DEATH,DEATH,ALIVE,DEATH,
            DEATH,DEATH,DEATH,ALIVE,ALIVE,DEATH,
            DEATH,DEATH,DEATH,DEATH,DEATH,DEATH
        )
            .next()
            .toString(),
        is(
            String.format(
                ""
                    + "      %n"
                    + " XX   %n"
                    + " XX   %n"
                    + "   XX %n"
                    + "   XX %n"
                    + "      "
            )
        )
    );
  }
}
