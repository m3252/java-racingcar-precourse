package race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.entity.CarName;
import race.entity.Distance;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    private RacingCar racer;

    @BeforeEach
    public void setup(){
        racer = new RacingCar("noah");
    }

    @Test
    @DisplayName("레이싱카는 이름과 이동거리를 갖는다.")
    public void 레이싱카는_이름과_이동거리를_갖는다(){
        assertThat(racer.getCarName()).isEqualTo(new CarName("noah"));
        assertThat(racer.currentMoveDistance()).isEqualTo(new Distance(0));
    }

    @Test
    @DisplayName("레이싱카는 이동할 수 있다.")
    public void 레이싱카는_이동할_수_있다(){
        assertThat(racer.currentMoveDistance()).isEqualTo(new Distance(0));
        racer.move(4);
        assertThat(racer.currentMoveDistance()).isEqualTo(new Distance(1));
    }
}
