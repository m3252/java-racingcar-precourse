package race;

import race.entity.CarName;
import race.entity.Distance;

import java.util.Objects;

public class RacingCar {

    private CarName name;
    private Distance moveDistance;

    public RacingCar(String name) {
        this.name = new CarName(name);
        this.moveDistance =  new Distance(0);
    }

    public CarName getCarName() {
        return name;
    }

    public Distance currentMoveDistance() {
        return moveDistance;
    }

    public void move(int randomValue) {
        if(randomValue > 3){
            moveDistance.addDistance();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCar racingCar = (RacingCar) o;
        return Objects.equals(name, racingCar.name) && Objects.equals(moveDistance, racingCar.moveDistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, moveDistance);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "name=" + name +
                ", moveDistance=" + moveDistance +
                '}';
    }
}
