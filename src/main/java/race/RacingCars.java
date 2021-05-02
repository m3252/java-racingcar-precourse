package race;


import race.entity.Cars;

public class RacingCars {

    private Cars racingCars = new Cars();

    public RacingCars(RacingCar ... car) {
        for (RacingCar racingCar : car) {
            this.racingCars.add(racingCar);
        }
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
