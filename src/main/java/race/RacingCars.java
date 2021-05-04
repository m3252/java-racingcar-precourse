package race;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {

    private final List<RacingCar> racingCars = new ArrayList<>();

    public RacingCars(RacingCar ... car) {
        this.racingCars.addAll(Arrays.asList(car));
    }

    public int size(){
        return racingCars.size();
    }

    @Override
    public String toString() {
        return "RacingCars{" +
                "racingCars=" + racingCars.toString() +
                '}';
    }
}
