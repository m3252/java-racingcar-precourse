package race;


import utils.RandomNumberUtils;

import java.util.*;

public class RacingCars {

    private final List<RacingCar> racingCars = new ArrayList<>();

    public RacingCars(List<RacingCar> cars) {
        checkNumberOfRacingCar(cars.size());
        checkNameDuplicate(cars);
        this.racingCars.addAll(cars);
    }

    private void checkNameDuplicate(List<RacingCar> cars) {
        Set<String> names = new HashSet<>();
        for(RacingCar car : cars){
            names.add(car.getCarName());
        }
        if(names.size() != cars.size()){
            throw new IllegalArgumentException("중복 참가는 불가능합니다.");
        }
    }

    private void checkNumberOfRacingCar(int size){
        if( 2 > size || size > 100){
            throw new IllegalArgumentException("참가 가능한 레이싱카는 2대 이상 100대 이하입니다.");
        }
    }

    public int size(){
        return racingCars.size();
    }


    public void race(){
        final int max = 9;
        final int min = 0;
        for (RacingCar racingCar : racingCars) {
            racingCar.move(RandomNumberUtils.createRandomNumber(max, min));
        }
    }

    public String[] winner(){
        for(int i=0; i< racingCars.size(); i++){
            System.out.println(racingCars.get(i).currentMoveDistance());
        }
        return new String[]{"",""};
    }

    @Override
    public String toString() {
        return "RacingCars{" +
                "racingCars=" + racingCars.toString() +
                '}';
    }
}
