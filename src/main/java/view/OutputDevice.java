package view;

import race.RacingCars;

public class OutputDevice {

    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String NUMBER_OF_ATTEMPTS_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String WINNERS_MESSAGE = "%s 가 최종 우승했습니다.";

    public static void printInputCarNamesMessage() {
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
    }

    public static void printInputNumberOfAttemptsMessage() {
        System.out.println(NUMBER_OF_ATTEMPTS_MESSAGE);
    }

    public static void printExecutionResult(RacingCars racingCars) {

    }

    public static void printWinners(String... carNames) {
        StringBuilder winners = new StringBuilder();
        for (String carName : carNames) {
            winners.append(carName);
        }
        System.out.printf(WINNERS_MESSAGE, winners.toString());
    }
}
