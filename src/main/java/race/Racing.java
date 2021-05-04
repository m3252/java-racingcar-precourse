package race;

import view.InputDevice;
import view.OutputDevice;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    public void ready(){
        OutputDevice.printInputCarNamesMessage();
        String[] carNames = InputDevice.receiveInputCarNames();
        RacingCars racingCars = participateRaceByCar(carNames);
        OutputDevice.printInputNumberOfAttemptsMessage();
        int numberOfAttempts = InputDevice.receiveInputNumberOfAttempts();
        race(racingCars, numberOfAttempts);
    }

    private RacingCars participateRaceByCar(String[] carNames){
        List<RacingCar> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new RacingCar(carName));
        }
        return new RacingCars(carList);
    }

    public void race(RacingCars racingCars, int numberOfAttempts){
        for (int i = numberOfAttempts; i >= 1; i--){
            racingCars.race();
            OutputDevice.printExecutionResult(racingCars);
        }
        OutputDevice.printWinners(winner(racingCars));
    }

    private List<String> winner(RacingCars racingCars){
        List<String> winnerNames = new ArrayList<>();
        for (int i=0; i< racingCars.size(); i++){
            findWinner(winnerNames, racingCars.get(i), racingCars.maxDistance());
        }
        return winnerNames;
    }

    private void findWinner(List<String> winnerNames, RacingCar racingCar, int maxDistance){
        if (maxDistance == racingCar.currentMoveDistance()){
            winnerNames.add(racingCar.getCarName());
        }
    }
}
