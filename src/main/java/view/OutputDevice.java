package view;

import race.RacingCars;

import java.util.List;

public class OutputDevice {

    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String NUMBER_OF_ATTEMPTS_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String WINNERS_MESSAGE = "%s가 최종 우승했습니다.";

    private static final String COLON = " : ";
    private static final String HYPHEN = "-";


    public static void printInputCarNamesMessage() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
    }

    public static void printInputNumberOfAttemptsMessage() {
        System.out.println(NUMBER_OF_ATTEMPTS_MESSAGE);
    }

    public static void printExecutionResult(RacingCars racingCars) {
        for (int i=0; i<racingCars.size(); i++) {
            System.out.println(racingCars.get(i).getCarName()
                    + COLON
                    + new String(new char[racingCars.get(i).currentMoveDistance()]).replace("\0", HYPHEN));
        }
        System.out.println();
    }

    public static void printWinners(List<String> winnerNames) {
        StringBuilder winners = new StringBuilder();
        for (String carName : winnerNames) {
            winners.append(carName).append(",");
        }
        System.out.printf(WINNERS_MESSAGE, winners.substring(0, winners.length()-1));
    }
}
