package race.entity;

import race.RacingCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cars {

    private List<RacingCar> cars = new ArrayList<>();

    public void add(RacingCar car){
        cars.add(car);
    }

    public int size(){
        return cars.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars1 = (Cars) o;
        return Objects.equals(cars, cars1.cars);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cars);
    }

    @Override
    public String toString() {
        return cars.toString();
    }
}
