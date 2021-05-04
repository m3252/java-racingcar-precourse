package race;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import race.entity.Distance;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCarsTest {

    private final List<RacingCar> cars = new ArrayList<>();

    @BeforeEach
    public void setUp(){
        cars.add(new RacingCar("noah"));
        cars.add(new RacingCar("kim"));
        cars.add(new RacingCar("lee"));
    }

    @Test
    @DisplayName("n 대의 자동차가 존재한다.")
    public void n_대의_자동차가_존재(){
        RacingCars racers = new RacingCars(cars);
        assertThat(racers.size()).isEqualTo(3);
    }
}
