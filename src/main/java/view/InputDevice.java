package view;

import java.util.Scanner;

public class InputDevice {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String[] receiveInputCarNames() {
        String[] carNames = SCANNER.nextLine().split(",");
        return carNames;
    }

    public static int receiveInputNumberOfAttempts() {
        String number = SCANNER.nextLine();
        checkInputValidValue(number);
        checkInputRange(number);
        return Integer.parseInt(number);
    }

    public static void checkInputValidValue(String number) {
        try {
            Integer.parseInt(number);
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("숫자만 입력 가능합니다.");
        }
    }

    public static void checkInputRange(String number) {
        int tryCount = Integer.parseInt(number);
        if( 1 > tryCount || tryCount > 1000){
            throw new IllegalArgumentException("숫자의 범위는 1 ~ 1000 사이로 이루어져야 합니다.");
        }
    }
}
