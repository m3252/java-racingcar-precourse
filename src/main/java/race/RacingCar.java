package race;

import race.entity.CarName;
import race.entity.Distance;

import java.util.Objects;

public class RacingCar {

    private CarName carName;
    private Distance moveDistance;

    public RacingCar(String carName) {
        this.carName = new CarName(carName);
        this.moveDistance =  new Distance(0);
    }

    public String getCarName() {
        return carName.getCarName();
    }

    public int currentMoveDistance() {
        return moveDistance.getDistance();
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
        return Objects.equals(carName, racingCar.carName) && Objects.equals(moveDistance, racingCar.moveDistance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, moveDistance);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "name=" + carName +
                ", moveDistance=" + moveDistance +
                '}';
    }
}
