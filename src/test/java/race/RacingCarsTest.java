package race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.entity.Distance;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {

    private RacingCar noah;
    private RacingCar kim;
    private RacingCar lee;

    @BeforeEach
    public void setUp(){
        noah = new RacingCar("noah");
        kim = new RacingCar("kim");
        lee = new RacingCar("lee");
    }

    @Test
    @DisplayName("n 대의 자동차가 존재한다.")
    public void n_대의_자동차가_존재(){
        RacingCars racers = new RacingCars(noah, kim, lee);
        assertThat(racers.size()).isEqualTo(3);
    }
}
