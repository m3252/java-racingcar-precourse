package race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.RandomNumberUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarTest {

    private RacingCar racer;
    private int number;
    private int max;
    private int min;

    @BeforeEach
    public void setup(){
        racer = new RacingCar("noah");
    }

    @Test
    @DisplayName("레이싱카는 이름과 이동거리를 갖는다.")
    public void 레이싱카는_이름과_이동거리를_갖는다(){
        assertThat(racer.getCarName()).isEqualTo("noah");
        assertThat(racer.currentMoveDistance()).isEqualTo(0);
    }

    @Test
    @DisplayName("레이싱카는 이동할 수 있다.")
    public void 레이싱카는_이동할_수_있다(){
        assertThat(racer.currentMoveDistance()).isEqualTo(0);
        racer.move(4);
        assertThat(racer.currentMoveDistance()).isEqualTo(1);
    }

    @Test
    @DisplayName("레이싱카는 랜덤 숫자가 4 이상이면 전진한다.")
    public void 랜덤_숫자가_4_이상이면_레이싱카는_전진한다(){
        max = 4;
        min = 4;
        number = RandomNumberUtils.createRandomNumber(max, min);
        racer.move(number);
        assertThat(racer.currentMoveDistance()).isEqualTo(1);
    }

    @Test
    @DisplayName("레이싱카는 랜덤 숫자가 3 이하이면 멈춘다.")
    public void 랜덤_숫자가_3_이하이면_레이싱카는_멈춘다() {
        max = 3;
        min = 3;
        number = RandomNumberUtils.createRandomNumber(max, min);
        racer.move(number);
        assertThat(racer.currentMoveDistance()).isEqualTo(0);
    }
}
