package race;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class RacingCarsTest {

    private final List<RacingCar> cars = new ArrayList<>();

    @Test
    @DisplayName("n 대의 레이싱카가 존재한다.")
    public void n_대의_레이싱카_생성(){
        cars.add(new RacingCar("noah"));
        cars.add(new RacingCar("kim"));
        cars.add(new RacingCar("lee"));
        RacingCars racers = new RacingCars(cars);
        assertThat(racers.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("레이싱카 참가 할 수 없다.")
    public void 레이싱카_이름이_중복이면_오류(){
        cars.add(new RacingCar("noah"));
        cars.add(new RacingCar("noah"));
        assertThatThrownBy(() -> new RacingCars(cars))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("중복 참가는 불가능합니다.");
    }

    @Test
    @DisplayName("n 대의 레이싱는 100대를 넘을수 없다.")
    public void n_대의_레이싱카_범위가_100를_초과하면_오류(){
        for(int i=0; i<101; i++) {
            cars.add(new RacingCar(String.valueOf(i)));
        }
        assertThat(cars.size()).isEqualTo(101);
        assertThatThrownBy(() -> new RacingCars(cars))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("참가 가능한 레이싱카는 2대 이상 100대 이하입니다.");
    }

    @Test
    @DisplayName("n 대의 레이싱는 0대 이상이다.")
    public void n_대의_레이싱카_범위가_2대_미만이면_오류(){
        assertThat(cars.size()).isEqualTo(0);
        assertThatThrownBy(() -> new RacingCars(cars))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("참가 가능한 레이싱카는 2대 이상 100대 이하입니다.");
    }
}
