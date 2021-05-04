package race;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {

    private final List<RacingCar> racingCars = new ArrayList<>();

    public RacingCars(List<RacingCar> cars) {
        checkNumberOfRacingCar(cars.size());
        this.racingCars.addAll(cars);
    }

    public int size(){
        return racingCars.size();
    }

    private void checkNumberOfRacingCar(int size){
        if( 2 > size || size > 100){
            throw new IllegalArgumentException("참가 가능한 레이싱카는 2대 이상 100대 이하입니다.");
        }
    }

    @Override
    public String toString() {
        return "RacingCars{" +
                "racingCars=" + racingCars.toString() +
                '}';
    }
}
